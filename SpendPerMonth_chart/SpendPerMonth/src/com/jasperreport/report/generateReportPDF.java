package com.jasperreport.report;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

import com.jasperreport.connection.ConnectionFactory;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class generateReportPDF {

	public static void main(String[] args) throws JRException, FileNotFoundException {

		// Responsible for compiling the report
		JasperCompileManager.compileReportToFile("SpendPerMonth.jrxml");

		try {
			Connection connection = new ConnectionFactory().getConnection();
			
			// This line is responsible for filling the report
			JasperPrint jasperPrint = JasperFillManager.fillReport("SpendPerMonth.jasper", null, connection);

			// Exporting to PDF
			JasperExportManager.exportReportToPdfFile(jasperPrint, "Spend_per_month.pdf");

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
