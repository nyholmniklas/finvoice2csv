package org.niklas.finvoice2csv.view;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.niklas.finvoice2csv.presenter.Finvoice2CsvPresenter;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.ProgressBar;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Upload.FailedEvent;
import com.vaadin.ui.Upload.FailedListener;
import com.vaadin.ui.Upload.FinishedEvent;
import com.vaadin.ui.Upload.FinishedListener;
import com.vaadin.ui.Upload.ProgressListener;
import com.vaadin.ui.Upload.Receiver;
import com.vaadin.ui.Upload.SucceededListener;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public abstract class UploadComponent extends VerticalLayout implements
		SucceededListener, FailedListener, Receiver, ProgressListener,
		FinishedListener {

	protected Upload upload;
	protected String directory;
	protected File file;
	protected long maxSize;
	protected ProgressBar progressBar;
	protected boolean cancelled = false;
	protected Long contentLength;
	protected Button cancelProcessing;
	protected HorizontalLayout processingLayout;
	private Finvoice2CsvPresenter presenter;

	public UploadComponent(String buttonCaption, Finvoice2CsvPresenter presenter) {
        this.presenter = presenter;
		upload = new Upload();
        this.addComponent(upload);
        this.maxSize = 1000000;
        upload.setReceiver( this); 
        this.directory = presenter.getFolderPath();
        upload.setButtonCaption(buttonCaption);
        upload.addSucceededListener((Upload.SucceededListener) this);
        upload.addFailedListener((Upload.FailedListener) this);
        upload.addProgressListener((Upload.ProgressListener) this);
        upload.addFinishedListener((Upload.FinishedListener) this);
        processingLayout = new HorizontalLayout();
        processingLayout.setSpacing(true);
        processingLayout.setVisible(false);
        this.addComponent(processingLayout);

        progressBar = new ProgressBar();
        processingLayout.addComponent(progressBar);
        
        cancelProcessing = new Button("Peruuta", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				cancelled = true;
                upload.interruptUpload();
				
			}
        });
        processingLayout.addComponent(cancelProcessing);
    }

	@Override
	public OutputStream receiveUpload(String filename, String MIMEType) {
		FileOutputStream fos = null;
		String extension = "";
		if (MIMEType.equals("application/xml")) {
			extension = ".xml";
		} else if (MIMEType.equals("text/xml")) {
			extension = ".xml";
		} else {
			Notification.show("Tiedosto ei ole xml tiedosto!",
					Notification.Type.ERROR_MESSAGE);
			upload.interruptUpload();
		}

		file = presenter.getXmlFile();

		try {
			fos = new FileOutputStream(file);
		} catch (final java.io.FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		return fos;
	}

	@Override
	public void updateProgress(long readBytes, long contentLength) {
		this.contentLength = contentLength;
		if (maxSize < contentLength) {
			upload.interruptUpload();
			return;
		}
		processingLayout.setVisible(true);
		progressBar.setValue(new Float(readBytes / (float) contentLength));
	}

	@Override
	public void uploadFinished(FinishedEvent event) {
		processingLayout.setVisible(false);
	}

	@Override
	public void uploadFailed(FailedEvent event) {
		processingLayout.setVisible(false);
		if (contentLength != null && maxSize < contentLength) {
			Notification.show("Tiedoston koko on " + contentLength / 1000
					+ "Kb. Ole hyvä ja valitse max " + maxSize / 1000
					+ "Kb kokoinen tiedosto.", Notification.Type.ERROR_MESSAGE);
		} else if (cancelled) {

		} else {
			Notification.show("Tiedoston latauksessa tapahtui virhe.",
					Notification.Type.ERROR_MESSAGE);
		}

		try {
			file.delete();
		} catch (Exception e) {

		}

		afterUploadFailed(event);
	}

	public void afterUploadFailed(FailedEvent event) {
	}

	public String getDirectory() {
		return directory;
	}

	public File getFile() {
		return file;
	}

}
