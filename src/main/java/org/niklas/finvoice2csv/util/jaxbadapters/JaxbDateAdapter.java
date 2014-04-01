package org.niklas.finvoice2csv.util.jaxbadapters;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

//This code is taken from mkyong JaxB tutorial
public class JaxbDateAdapter extends XmlAdapter<String, Date> {
	 
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
 
	@Override
	public String marshal(Date date) throws Exception {
		return dateFormat.format(date);
	}
 
	@Override
	public Date unmarshal(String date) throws Exception {
		return dateFormat.parse(date);
	}
 
}
