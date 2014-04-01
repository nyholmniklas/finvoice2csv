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

	// TODO TEST ADDRESSES!!!!

	@Test
	public void testDeliveryOrganisationName() {
		assertTrue(finvoice.getDeliveryPartyDetails()
				.getDeliveryOrganisationName()
				.equals("ProCountor International Oy"));
	}

	// TODO TEST DATES!!!!
	
	@Test
	public void testInvoiceTypeCode() {
		assertTrue(finvoice.getInvoiceDetails().getInvoiceTypeCode()
				.equals("M"));
	}
	
	@Test
	public void testInvoiceTotalVatExcludedAmount() {
		assertTrue(finvoice.getInvoiceDetails().getInvoiceTotalVatExcludedAmount()
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
