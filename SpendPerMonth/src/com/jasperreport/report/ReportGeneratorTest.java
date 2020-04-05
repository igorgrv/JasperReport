package com.jasperreport.report;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.jasperreport.connection.ConnectionFactory;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

public class ReportGeneratorTest {

	public static void main(String[] args) throws JRException, SQLException {
		
		JasperCompileManager.compileReportToFile("SpendPerMonth.jrxml");
		
		String jasperName = "SpendPerMonth";
		Map<String, Object> parameter = new HashMap<String, Object>();
		Connection connection = new ConnectionFactory().getConnection();
		
		ReportGenerator generator = new ReportGenerator(jasperName + ".jasper", parameter, connection);
		generator.ReportGeneratorPDF(jasperName+ ".pdf");
		
		connection.close();
	}

}
