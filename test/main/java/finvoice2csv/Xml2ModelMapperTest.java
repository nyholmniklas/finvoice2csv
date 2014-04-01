package finvoice2csv;

import static org.junit.Assert.*;

import java.io.File;
import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.niklas.finvoice2csv.model.Finvoice;
import org.niklas.finvoice2csv.util.Xml2ModelMapper;
import org.niklas.finvoice2csv.util.Xml2ModelMapperImpl;

public class Xml2ModelMapperTest {
	private Finvoice finvoice;

	@Before
	public void setUp() {
		Xml2ModelMapper mapper = new Xml2ModelMapperImpl();
		finvoice = mapper.getFinvoiceFromXml(new File("c:\\temp\\lasku.xml"));
	}

	@Test
	public void testBuyerPartyIdentifier() {
		assertTrue(finvoice.getBuyerPartyDetails().getBuyerPartyIdentifier()
				.equals("0836922-4"));
	}

	@Test
	public void testBuyerOrganisationName() {
		assertTrue(finvoice.getBuyerPartyDetails().getBuyerOrganisationName()
				.equals("ProCountor International Oy"));
	}

	@Test
	public void testBuyerStreetName() {
		assertTrue(finvoice.getBuyerPartyDetails()
				.getBuyerPostalAddressDetails().getBuyerStreetName()
				.equals("Maapallonkuja 1 A"));
	}
	
	@Test
	public void testBuyerTownName() {
		assertTrue(finvoice.getBuyerPartyDetails()
				.getBuyerPostalAddressDetails().getBuyerTownName()
				.equals("ESPOO"));
	}
	
	@Test
	public void testBuyerPostcodeIdentifier() {
		assertTrue(finvoice.getBuyerPartyDetails()
				.getBuyerPostalAddressDetails().getBuyerPostCodeIdentifier()
				.equals("02150"));
	}
	
	@Test
	public void testBuyerCountryCode() {
		assertTrue(finvoice.getBuyerPartyDetails()
				.getBuyerPostalAddressDetails().getCountryCode()
				.equals("FI"));
	}

	@Test
	public void testDeliveryOrganisationName() {
		assertTrue(finvoice.getDeliveryPartyDetails()
				.getDeliveryOrganisationName()
				.equals("ProCountor International Oy"));
	}
	
	@Test
	public void testDeliveryStreetName() {
		assertTrue(finvoice.getDeliveryPartyDetails()
				.getDeliveryPostalAddressDetails().getDeliveryStreetName()
				.equals("Keilaranta 8"));
	}
	
	@Test
	public void testDeliveryTownName() {
		assertTrue(finvoice.getDeliveryPartyDetails()
				.getDeliveryPostalAddressDetails().getDeliveryTownName()
				.equals("ESPOO"));
	}
	
	@Test
	public void testDeliveryPostcodeIdentifier() {
		assertTrue(finvoice.getDeliveryPartyDetails()
				.getDeliveryPostalAddressDetails().getDeliveryPostCodeIdentifier()
				.equals("02150"));
	}
	
	@Test
	public void testDeliveryCountryCode() {
		assertTrue(finvoice.getDeliveryPartyDetails()
				.getDeliveryPostalAddressDetails().getCountryCode()
				.equals("FI"));
	}

	// TODO TEST DATES!!!!

	@Test
	public void testInvoiceTypeCode() {
		assertTrue(finvoice.getInvoiceDetails().getInvoiceTypeCode()
				.equals("M"));
	}

	@Test
	public void testInvoiceTotalVatExcludedAmount() {
		assertTrue(finvoice.getInvoiceDetails()
				.getInvoiceTotalVatExcludedAmount()
				.equals(new BigDecimal("2450.00")));
	}

	@Test
	public void testInvoiceTotalVatAmount() {
		assertTrue(finvoice.getInvoiceDetails().getInvoiceTotalVatAmount()
				.equals(new BigDecimal("563.50")));
	}

	@Test
	public void testPaymentOverDueFinePercent() {
		assertTrue(finvoice.getInvoiceDetails().getPaymentTermsDetails()
				.getPaymentOverDueFineDetails().getPaymentOverDueFinePercent()
				.equals(new BigDecimal("10.5")));
	}
}
