package org.niklas.finvoice2csv;

import java.io.File;

import javax.servlet.annotation.WebServlet;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.niklas.finvoice2csv.model.finvoice.Finvoice;

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
public class MyVaadinUI extends UI
{


    @Override
    protected void init(VaadinRequest request) {
    	testXmlConversion();
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        setContent(layout);
        
        Button button = new Button("Click Me");
        button.addClickListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                layout.addComponent(new Label("Thank you for clicking"));
            }
        });
        layout.addComponent(button);
    }

	private void testXmlConversion() {
		 try {
			 
				File file = new File("C:\\temp\\lasku.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(Finvoice.class);
		 
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Finvoice finvoice = (Finvoice) jaxbUnmarshaller.unmarshal(file);
				System.out.println(finvoice.getBuyerPartyDetails().getBuyerPartyIdentifier());
		 
			  } catch (JAXBException e) {
				e.printStackTrace();
			  }
	}

}
