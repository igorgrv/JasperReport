package com.jasperreport.generator;

import java.io.OutputStream;
import java.sql.Connection;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class ReportGenerator {

	private String jasperName;
	private Map<String, Object> parameter;
	private Connection connection;
	
	public ReportGenerator(String jasperName, Map<String, Object> parameter, Connection connection) {
		this.jasperName = jasperName;
		this.parameter = parameter;
		this.connection = connection;
	}
	
	public void ReportGeneratorPDF(OutputStream outputStream) {
		try {
			JasperPrint jasperPrint = JasperFillManager.fillReport(this.jasperName, this.parameter, this.connection);
			
			JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
		} catch (JRException e) {
			e.printStackTrace();
		}
	}
	
	
}
