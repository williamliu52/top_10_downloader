package com.example.top10downloader;

import java.io.StringReader;
import java.util.ArrayList;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class ParseApplications {
	
	private String data;
	private ArrayList<Application> applications;

	public ParseApplications(String xmlData) {
		data = xmlData;
		applications = new ArrayList<Application>();
	}

	public ArrayList<Application> getApplications() {
		return applications;
	}
	
	public boolean process() {
		boolean operationStatus = true;
		Application currentRecord = null;
		boolean inEntry = false;
		String textValue = "";
		
		try {
			XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
			factory.setNamespaceAware(true);
			XmlPullParser xpp = factory.newPullParser();
			
			xpp.setInput(new StringReader(this.data));
			int eventType = xpp.getEventType();
			while (eventType != XmlPullParser.END_DOCUMENT) {
				String tagName = xpp.getName();
			}
				
			
			
		} catch(Exception e) {
			e.printStackTrace();
			operationStatus = false;
		}
		
		return operationStatus;
	}
}
