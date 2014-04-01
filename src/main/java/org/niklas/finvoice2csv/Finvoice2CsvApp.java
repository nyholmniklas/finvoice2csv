package org.niklas.finvoice2csv;

import java.io.File;

import javax.servlet.annotation.WebServlet;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.niklas.finvoice2csv.model.Finvoice;
import org.niklas.finvoice2csv.presenter.Finvoice2CsvPresenter;
import org.niklas.finvoice2csv.util.mappers.Xml2ModelMapper;
import org.niklas.finvoice2csv.util.mappers.Xml2ModelMapperImpl;
import org.niklas.finvoice2csv.view.Finvoice2CsvView;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class Finvoice2CsvApp extends UI
{
    private Finvoice2CsvPresenter presenter;
	private Finvoice2CsvView view;

	@Override
    protected void init(VaadinRequest request) {
    	String sessionId = getSession().getSession().getId();
    	presenter = new Finvoice2CsvPresenter(sessionId);
    	view = new Finvoice2CsvView(presenter);
    	setLayout();
    }
    
    private void setLayout(){
    	VerticalLayout layout = new VerticalLayout();
    	layout.setSizeFull();
    	layout.addComponent(view);
    	layout.setComponentAlignment(view, Alignment.MIDDLE_CENTER);
    	setContent(layout);
    }

}
