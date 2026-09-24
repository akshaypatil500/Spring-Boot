package com.tca.bean;

public class ExcelReportCreator implements ReportCreator {

	@Override
	public void createReport(int pages) {

		System.out.println("ExcelReportCreator: Generating Reports !! "+pages);


	}

}
