package com.tca.bean;

public class ReportManager {

	private int pages;
	private ReportCreator reportCreator; // interface


	public ReportManager() {

	}


	public ReportManager(ReportCreator reportCreator) {

		this.reportCreator = reportCreator;
		System.out.println("Constructor Injection");
	}

	public void setReportCreator(ReportCreator reportCreator) {
		this.reportCreator = reportCreator;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public void printReport() {
		reportCreator.createReport(pages);// we want sercices from that class
	}

}
