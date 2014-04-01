package org.niklas.finvoice2csv.util.mappers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;

import org.niklas.finvoice2csv.model.Finvoice;
import org.niklas.finvoice2csv.model.InvoiceRow;

public class Model2CsvMapperImpl implements Model2CsvMapper {
	private SimpleDateFormat dateFormat;
	private DecimalFormat decimalFormat;

	public Model2CsvMapperImpl() {
		dateFormat = new SimpleDateFormat("dd.M.yyyy");

		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator(',');

		decimalFormat = new DecimalFormat("0.00", symbols);
	}

	@Override
	public void createCsvFileFromFinvoice(Finvoice finvoice, File file)
			throws IOException {
		// Check if file exists and create it if not
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file);
		BufferedWriter writer = new BufferedWriter(fw);

		writeInvoiceDetails(finvoice, writer);
		writeInvoiceRows(finvoice, writer);

		writer.close();
	}
	
//	;Jura X9000 kahvikone;X9000;1;kpl;2460;;23;;;;;;;;;;;;;;;;;;
	private void writeInvoiceRows(Finvoice finvoice, BufferedWriter writer) throws IOException {
		for (InvoiceRow row:finvoice.getInvoiceRow()) {
			writer.newLine();
			writer.write(";");
			writer.write(row.getArticleName() + ";");
			writer.write(row.getArticleIdentifier() + ";");
			writer.write(row.getOrderedQuantity() + ";");
			//TODO kpl below is assumed, it should be parsed properly
			writer.write("kpl" + ";");
			writer.write(row.getUnitPriceAmount() + ";");
			writer.write(";");
			writer.write(row.getRowVatRatePercent() + ";");
			writer.write(";;;;;;;;;;;;;;;;;");
		}
	}

	private void writeInvoiceDetails(Finvoice finvoice, BufferedWriter writer)
			throws IOException {
		writer.write(finvoice.getInvoiceDetails().getInvoiceTypeCode() + ";");
		// TODO Currency is assumed to be in EUR, should be parsed aswell!
		// Currently unclear how to map from finvoice standard to procountor
		// (value specific vs invoice specific)
		writer.write("EUR" + ";");
		writer.write(";;");
		writer.write(finvoice.getBuyerPartyDetails().getBuyerPartyIdentifier()
				+ ";");
		writer.write(";");
		writer.write(finvoice.getBuyerPartyDetails().getBuyerOrganisationName()
				+ ";");
		writer.write(";;;;");
		writer.write(decimalFormat.format(finvoice.getInvoiceDetails()
				.getPaymentTermsDetails().getPaymentOverDueFineDetails()
				.getPaymentOverDueFinePercent())
				+ ";");
		writer.write(dateFormat.format(finvoice.getInvoiceDetails()
				.getInvoiceDate()) + ";");
		writer.write(";");
		writer.write(dateFormat.format(finvoice.getInvoiceDetails()
				.getPaymentTermsDetails().getInvoiceDueDate())
				+ ";");
		writer.write(";");
		
		writeBuyerAddress(finvoice, writer);
		writeDeliveryAddress(finvoice, writer);
		
		writer.write(";;;;;;");
		// TODO Number 2 below refers to "laskukanava", according to
		// http://support.procountor.com/fi/aineiston-sisaanluku/laskuaineiston-siirtotiedosto.html,
		// it should also be parsed but is not included in sample xml
		writer.write("2");
	}
	
	private void writeBuyerAddress(Finvoice finvoice, BufferedWriter writer) throws IOException {
		writer.write(finvoice.getBuyerPartyDetails().getBuyerOrganisationName()
				+ "\\"
				+ finvoice.getBuyerPartyDetails()
						.getBuyerPostalAddressDetails().getBuyerStreetName()
				+ "\\"
				+ finvoice.getBuyerPartyDetails()
						.getBuyerPostalAddressDetails()
						.getBuyerPostCodeIdentifier()
				+ "\\"
				+ finvoice.getBuyerPartyDetails()
						.getBuyerPostalAddressDetails().getBuyerTownName()
				+ "\\"
				+ finvoice.getBuyerPartyDetails()
						.getBuyerPostalAddressDetails().getCountryCode() + ";");
	}

	private void writeDeliveryAddress(Finvoice finvoice, BufferedWriter writer) throws IOException {
		writer.write(finvoice.getDeliveryPartyDetails()
				.getDeliveryOrganisationName()
				+ "\\"
				+ finvoice.getDeliveryPartyDetails()
						.getDeliveryPostalAddressDetails()
						.getDeliveryStreetName()
				+ "\\"
				+ finvoice.getDeliveryPartyDetails()
						.getDeliveryPostalAddressDetails()
						.getDeliveryPostCodeIdentifier()
				+ "\\"
				+ finvoice.getDeliveryPartyDetails()
						.getDeliveryPostalAddressDetails()
						.getDeliveryTownName()
				+ "\\"
				+ finvoice.getDeliveryPartyDetails()
						.getDeliveryPostalAddressDetails().getCountryCode()
				+ ";");
		writer.write(finvoice.getInvoiceDetails().getInvoiceFreeText() + ";");
	}

}
