package org.niklas.finvoice2csv.util;

import java.io.File;

import org.niklas.finvoice2csv.model.Finvoice;

public interface Xml2ModelMapper {
	public Finvoice getFinvoiceFromXml(File xmlFile);
}
