package org.niklas.finvoice2csv.util.mappers;

import java.io.File;

import javax.xml.bind.JAXBException;

import org.niklas.finvoice2csv.model.Finvoice;

public interface Xml2ModelMapper {
	public Finvoice getFinvoiceFromXml(File xmlFile) throws JAXBException;
}
