package com.tca.bean;

public class PdfReportCreator implements ReportCreator {

	
	public void createReport(int pages) {
		
		System.out.println("PdfReportCreator: Generating Reports !! "+pages);

	}

}
