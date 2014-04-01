package org.niklas.finvoice2csv.view;

import org.niklas.finvoice2csv.presenter.Finvoice2CsvPresenter;

import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.Button;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Upload.SucceededEvent;

public class Finvoice2CsvView extends Panel{
	
	private Finvoice2CsvPresenter presenter;
	
	private UploadComponent uploadComponent;

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
				// TODO Auto-generated method stub
				
			}
		};
		
	}

	private void setLayout() {
		VerticalLayout layout = new VerticalLayout();
		layout.setSpacing(true);
		layout.setMargin(true);
		layout.setSizeFull();
		layout.addComponent(uploadComponent);
		setContent(layout);
	}

	private void setActionListeners() {
		// TODO Auto-generated method stub
		
	}

}
