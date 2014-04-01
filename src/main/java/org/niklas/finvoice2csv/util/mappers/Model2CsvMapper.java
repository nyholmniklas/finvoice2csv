package org.niklas.finvoice2csv.util.mappers;

import java.io.File;
import java.io.IOException;

import org.niklas.finvoice2csv.model.Finvoice;

public interface Model2CsvMapper {
	public void createCsvFileFromFinvoice(Finvoice finvoice, File file) throws IOException;
}
