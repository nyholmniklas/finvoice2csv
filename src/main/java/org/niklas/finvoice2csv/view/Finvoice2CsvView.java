package org.niklas.finvoice2csv.view;

import java.io.File;
import java.io.IOException;

import org.niklas.finvoice2csv.presenter.Finvoice2CsvPresenter;

import com.vaadin.data.util.BeanItem;
import com.vaadin.server.FileDownloader;
import com.vaadin.server.FileResource;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Upload.SucceededEvent;
import com.vaadin.ui.themes.Reindeer;

public class Finvoice2CsvView extends Panel{
	
	private Finvoice2CsvPresenter presenter;
	
	private Label title;
	private UploadComponent uploadComponent;
	private Label uploadStatusLabel;
	private Button downloadButton;

	private FileDownloader fileDownloader;

	public Finvoice2CsvView(Finvoice2CsvPresenter presenter) {
		super();
		this.presenter = presenter;
		initComponents();
		setLayout();
	}

	private void initComponents() {
		uploadComponent = new UploadComponent("Lähetä XML", presenter) {
			
			@Override
			public void uploadSucceeded(SucceededEvent event) {
				presenter.parseFinvoiceFromXml();
				uploadStatusLabel.setValue("XML tiedosto on vastaanotettu. Voit ladata CSV tiedoston tai lähettää toisen XML tiedoston.");
				try {
					enableDownloadLink();
				} catch (IOException e) {
					Notification.show("Ongelma CSV tiedoston luonnissa.",
							Notification.Type.ERROR_MESSAGE);
					e.printStackTrace();
				}
			}
		};
		// Setting html tags below is probably not vaadin best practice, but functional atm
		title = new Label("Finvoice2Csv");
		uploadStatusLabel = new Label("Valitse ja lähetä Finvoice muodossa oleva XML tiedosto.");
		title.setStyleName("h1");
		uploadStatusLabel.setStyleName("b");
		downloadButton = new Button("Lataa CSV");
		downloadButton.setStyleName(Reindeer.BUTTON_DEFAULT);
	}

	private void setLayout() {
		VerticalLayout layout = new VerticalLayout();
		layout.setSpacing(true);
		layout.setMargin(true);
		layout.setSizeFull();
		setWidth(400, Unit.PIXELS);
		setHeight(200, Unit.PIXELS);
		
		layout.addComponent(title);
		layout.addComponent(uploadComponent);
		layout.addComponent(uploadStatusLabel);
		layout.addComponent(downloadButton);
		
		layout.setComponentAlignment(title, Alignment.TOP_CENTER);
		layout.setComponentAlignment(downloadButton, Alignment.BOTTOM_CENTER);
		layout.setComponentAlignment(uploadStatusLabel, Alignment.BOTTOM_CENTER);
		downloadButton.setEnabled(false);
		
		setContent(layout);
	}
	
	private void enableDownloadLink() throws IOException{
			downloadButton.setEnabled(false);
			fileDownloader = new FileDownloader(new FileResource(presenter.getCsvFile()));
			fileDownloader.extend(downloadButton);
			downloadButton.setEnabled(true);
	}

}
