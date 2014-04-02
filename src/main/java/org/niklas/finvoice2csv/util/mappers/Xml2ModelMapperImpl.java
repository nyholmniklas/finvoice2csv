package org.niklas.finvoice2csv.util.mappers;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.niklas.finvoice2csv.model.Finvoice;

public class Xml2ModelMapperImpl implements Xml2ModelMapper {

	@Override
	public Finvoice getFinvoiceFromXml(File xmlFile) throws JAXBException {
		Finvoice finvoice = new Finvoice();
			JAXBContext jaxbContext = JAXBContext.newInstance(Finvoice.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			finvoice = (Finvoice) jaxbUnmarshaller.unmarshal(xmlFile);


		return finvoice;
	}

}
