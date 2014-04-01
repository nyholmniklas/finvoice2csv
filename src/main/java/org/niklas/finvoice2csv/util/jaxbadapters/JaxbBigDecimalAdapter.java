package org.niklas.finvoice2csv.util.jaxbadapters;

import java.math.BigDecimal;

import javax.xml.bind.annotation.adapters.XmlAdapter;


//This code is taken from mkyong JaxB tutorial
public class JaxbBigDecimalAdapter extends XmlAdapter<String, BigDecimal> {
 

	@Override
	public String marshal(BigDecimal obj) throws Exception {
		return obj.toString();
	}
	
	@Override
	public BigDecimal unmarshal(String obj) throws Exception {
		return new BigDecimal(obj.replaceAll(",", "."));
	}

 
}
