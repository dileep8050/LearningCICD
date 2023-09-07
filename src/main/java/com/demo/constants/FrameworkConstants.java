package com.demo.constants;

public final class FrameworkConstants {
	private FrameworkConstants() {}
	
	private static final String RESOURCEPATH=System.getProperty("user.dir");
	private static final String CONFIGFILEPATH=RESOURCEPATH+"/src/test/resources/config/config.properties";
	private static final int EXPLICITWAITTIME=10;
	private static final String EXTENTREPORTPATH=RESOURCEPATH+"/extentReport/index.html";
	private static final String EXCELPATH=RESOURCEPATH+"/src/test/resources/excel/testData.xlsx";
	private static final String RUNMANAGERSHEET="RUNMANAGER";
	private static final String DATASHEET="DATA";
		
	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}

	public static int getExplicitWaitTime() {
		return EXPLICITWAITTIME;
	}

	public static String getExtentReportPath() {
		return EXTENTREPORTPATH;
	}

	public static String getExcelPath() {
		return EXCELPATH;
	}

	public static String getRunManagerSheet() {
		return RUNMANAGERSHEET;
	}

	public static String getDataSheet() {
		return DATASHEET;
	}
	
	
}
