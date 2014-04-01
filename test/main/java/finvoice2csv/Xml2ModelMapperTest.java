package finvoice2csv;

import static org.junit.Assert.*;

import java.io.File;

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
	public void testBuyerOrganisationName() {
		assertTrue(finvoice.getBuyerPartyDetails().getBuyerOrganisationName().equals("ProCountor International Oy"));
	}

}
