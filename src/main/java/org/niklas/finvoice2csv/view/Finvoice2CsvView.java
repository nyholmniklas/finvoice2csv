package org.niklas.finvoice2csv.view;

import java.io.File;

import org.niklas.finvoice2csv.presenter.Finvoice2CsvPresenter;

import com.vaadin.data.util.BeanItem;
import com.vaadin.server.FileDownloader;
import com.vaadin.server.FileResource;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Upload.SucceededEvent;

public class Finvoice2CsvView extends Panel{
	
	private Finvoice2CsvPresenter presenter;
	
	private UploadComponent uploadComponent;
	private Label uploadStatusLabel;
	private Button downloadButton;

	private FileDownloader fileDownloader;

	public Finvoice2CsvView(Finvoice2CsvPresenter presenter) {
		super();
		this.presenter = presenter;
		initComponents();
		setLayout();
		setActionListeners();
	}

	private void initComponents() {
		uploadComponent = new UploadComponent("Lähetä XML", presenter.getFolderPath()) {
			
			@Override
			public void uploadSucceeded(SucceededEvent event) {
				uploadStatusLabel.setValue("Finvoice tiedosto vastaanotettu.");
				enableDownloadLink();
			}
		};
		uploadStatusLabel = new Label("Et ole vielä lähettänyt XML Finvoice tiedostoa.");
		downloadButton = new Button("Lataa CSV");
	}

	private void setLayout() {
		VerticalLayout layout = new VerticalLayout();
		layout.setSpacing(true);
		layout.setMargin(true);
		layout.setSizeFull();
		
		layout.addComponent(uploadComponent);
		layout.addComponent(uploadStatusLabel);
		layout.addComponent(downloadButton);
		downloadButton.setEnabled(false);
		
		setContent(layout);
	}

	private void setActionListeners() {
		// TODO Auto-generated method stub
		
	}
	
	private void enableDownloadLink(){
			downloadButton.setEnabled(false);
			fileDownloader = new FileDownloader(new FileResource(presenter.getCsvFile()));
			fileDownloader.extend(downloadButton);
			downloadButton.setEnabled(true);
	}

}
