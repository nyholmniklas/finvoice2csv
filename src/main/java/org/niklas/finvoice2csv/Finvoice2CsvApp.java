package org.niklas.finvoice2csv;

import java.io.File;

import javax.servlet.annotation.WebServlet;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.niklas.finvoice2csv.model.Finvoice;
import org.niklas.finvoice2csv.presenter.Finvoice2CsvPresenter;
import org.niklas.finvoice2csv.util.Xml2ModelMapper;
import org.niklas.finvoice2csv.util.Xml2ModelMapperImpl;
import org.niklas.finvoice2csv.view.Finvoice2CsvView;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class Finvoice2CsvApp extends UI
{

    @Override
    protected void init(VaadinRequest request) {
    	String sessionId = getSession().getSession().getId();
    	Finvoice2CsvPresenter presenter = new Finvoice2CsvPresenter(sessionId);
    	setContent(new Finvoice2CsvView(presenter));
    }

}
