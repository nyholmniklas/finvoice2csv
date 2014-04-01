package org.niklas.finvoice2csv.presenter;

import java.io.File;

public class Finvoice2CsvPresenter {
//	private File file;
	public static final String OPENSHIFT_PATH = System
			.getenv("OPENSHIFT_DATA_DIR");
	public static final String LOCAL_PATH = "C:\\temp\\";
	private String folderPath;

	public Finvoice2CsvPresenter() {
		setFolderPath();
		setFile();
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

	private void setFile() {
		if (!new File(folderPath).exists())
			new File(folderPath).mkdir();
	}

	public String getFolderPath() {
		return folderPath;
	}

}
