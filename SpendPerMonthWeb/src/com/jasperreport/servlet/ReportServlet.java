package com.jasperreport.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jasperreport.connection.ConnectionFactory;
import com.jasperreport.generator.ReportGenerator;

@WebServlet("/transactions")
public class ReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//Because the .jasper is inside the folder "jasper", we need to use the servlet
			String name = request.getServletContext().getRealPath("WEB-INF/jasper/SpendPerMonth.jasper") ;
			Map<String, Object> parameter = new HashMap<String, Object>();
			Connection connection = new ConnectionFactory().getConnection();
			
			//Mapping parameter from the form
			String startDate = request.getParameter("start_date");
			String endDate = request.getParameter("end_date");
			String type = request.getParameter("type");
			
			//Transforming the string provides from the form, to Date
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			Date startDateParse = sdf.parse(startDate);
			Date endDateParse = sdf.parse(endDate);
			
			//Mapping parameter from the iReport
			parameter.put("START_DATE", startDateParse);
			parameter.put("END_DATE", endDateParse);
			parameter.put("TYPE", type);
			
			ReportGenerator generator = new ReportGenerator(name, parameter, connection);
			generator.ReportGeneratorPDF(response.getOutputStream());
			
			connection.close();
		} catch (SQLException | ParseException e) {
			throw new ServletException(e);
		}
	}

}
