package org.niklas.finvoice2csv.util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.niklas.finvoice2csv.model.Finvoice;

public class Xml2ModelMapperImpl implements Xml2ModelMapper {

	@Override
	public Finvoice getFinvoiceFromXml(File xmlFile) {
		Finvoice finvoice = new Finvoice();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Finvoice.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			finvoice = (Finvoice) jaxbUnmarshaller.unmarshal(xmlFile);

		} catch (JAXBException e) {
			e.printStackTrace();
			//TODO throw this exception instead of catching to inform ui that conversion failed
		}
		return finvoice;
	}

}
