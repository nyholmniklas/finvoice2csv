package org.niklas.finvoice2csv.presenter;

import java.io.File;

import com.vaadin.ui.UI;

public class Finvoice2CsvPresenter {
	private String sessionId;
	private File csvFile;
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

	public File getCsvFile() {
		// TODO Change to csv (xml for testing)
		return new File(folderPath + "/" + sessionId + ".xml");
	}

}
