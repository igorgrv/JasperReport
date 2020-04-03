package com.jasperreport.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

import com.jasperreport.connection.ConnectionFactory;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;

public class generateReportPDF {

	public static void main(String[] args) throws JRException, FileNotFoundException {

		// Responsible for compiling the report
//		JasperCompileManager.compileReportToFile("finances.jrxml");

		try {
			Connection connection = new ConnectionFactory().getConnection();
			
			// This line is responsible for filling the report
			JasperPrint jasperPrint = JasperFillManager.fillReport("SpendPerMonth.jasper", null, connection);

			// Exporting to PDF
//			JasperExportManager.exportReportToPdfFile(jasperPrint, "Spend_per_month_blue.pdf");
			
			JRXlsxExporter exporter = new JRXlsxExporter();
			exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
			File outputFile = new File("excelTest.xlsx");
			exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(outputFile));
			SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration(); 
			configuration.setDetectCellType(true);//Set configuration as you like it!!
			configuration.setCollapseRowSpan(false);
			exporter.setConfiguration(configuration);
			exporter.exportReport();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
