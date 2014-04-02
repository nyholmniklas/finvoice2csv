package org.niklas.finvoice2csv.presenter;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.niklas.finvoice2csv.model.Finvoice;
import org.niklas.finvoice2csv.util.mappers.Model2CsvMapper;
import org.niklas.finvoice2csv.util.mappers.Model2CsvMapperImpl;
import org.niklas.finvoice2csv.util.mappers.Xml2ModelMapper;
import org.niklas.finvoice2csv.util.mappers.Xml2ModelMapperImpl;

import com.vaadin.ui.UI;

public class Finvoice2CsvPresenter {
	private String sessionId;
	private Finvoice finvoice;
	public static final String OPENSHIFT_PATH = System
			.getenv("OPENSHIFT_DATA_DIR");
	public static final String LOCAL_PATH = "C:\\temp\\";
	private String folderPath;

	public Finvoice2CsvPresenter(String sessionId) {
		this.sessionId = sessionId;
		setFolderPath();
		createFolderPathDirectory();
	}

	private void setFolderPath() {
		// Check if application is deployed on openshift platform or developer's
		// local machine and set folder path accordingly
		if (OPENSHIFT_PATH == null || OPENSHIFT_PATH.isEmpty()) {
			System.out.println("Using local file path");
			folderPath = LOCAL_PATH;
		} else {
			System.out.println("Using openshift file path");
			folderPath = OPENSHIFT_PATH;
		}
	}

	private void createFolderPathDirectory() {
		if (!new File(folderPath).exists())
			new File(folderPath).mkdir();
	}

	public String getFolderPath() {
		return folderPath;
	}

	public File getCsvFile() throws IOException {
		File file = new File(folderPath + "/" + sessionId + ".csv");
		Model2CsvMapper model2CsvMapper = new Model2CsvMapperImpl();
		model2CsvMapper.createCsvFileFromFinvoice(finvoice, file);
		return file;
	}

	public void parseFinvoiceFromXml() throws JAXBException {
		Xml2ModelMapper xml2ModelMapper = new Xml2ModelMapperImpl();
		finvoice = xml2ModelMapper.getFinvoiceFromXml(getXmlFile());
		
	}

	public File getXmlFile() {
		File file = new File(folderPath + "/" + sessionId + ".xml");
		return file;
	}

}
