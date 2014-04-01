package org.niklas.finvoice2csv.util;

import java.io.File;

import org.niklas.finvoice2csv.model.Finvoice;

public interface Model2CsvMapper {
	public void createCsvFileFromFinvoice(Finvoice finvoice, File file);
}
