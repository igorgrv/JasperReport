# Jasper Report
This project is an example of an use of a Report Engine, called iReport. With this Report Design, we can create layouts containing charts, images, subreports, crosstabs and much more. We can access data through JDBC, Hibernate, CSV, and custom sources. Then we also can publish our reports as PDF, XML, XLS, CSV, text or DOCX.

## Set up
1. Download [Java 7](https://www.oracle.com/java/technologies/javase/javase7-archive-downloads.html) -windows-x64.tar.gz version _(it's necessary to use the iReport)_;
2. Download [iReport Designer](https://community.jaspersoft.com/project/ireport-designer/releases) - .zip version;
3. Download the  - [finances.sql](https://github.com/igorgrv/JasperReport/blob/master/finances.sql)
4. Open the app - /bin/ireport.exe

_If you have problems to open the iReport, check it out: [ireport-not-starting-using-jre-8](https://stackoverflow.com/questions/23902977/ireport-not-starting-using-jre-8)_

## Getting started
### DataSource
1. Open the dataSource as the image bellow:
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/datasource.PNG?raw=true" alt="alt text" width="650" height="400">
2. Write a name, select the location of the localhost and put the User/Pass;
3. Test the Connection;

### Template
1. Select one of those templates and launch;
2. Go to "Design Query" and type **select** * **from financial_movements**;
	*	It's possible to edit the query, as the image bellow
	<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/editingQuery.PNG?raw=true" alt="alt text" width="400" height="300">
	
4. Select all the fields (except by account_id and categories_id);
5. Next and Finish;
6. You should see the set up as in the image below:
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/template.png?raw=true" alt="alt text" width="700" height="300">

7. Click on **preview** to see the document.
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/preview.PNG?raw=true" alt="alt text" width="400" height="200">

## Changing the pattern

1. Select the field;
2. Go to Pattern (Text field properties);
3. Type "dd/MM/yyyy" or use the assistent clicking on "..."
![alt text](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/pattern.PNG?raw=true)

## Creating a 'blank' report!
1. Select a new 'blank' template;
2. Follow the getting started;
	* Select the fields, as the and put group by 'owner'
3. Move the fields to "Detail"
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/fieldstodetails.png?raw=true" alt="alt text" width="400" height="200">

4. Decrease the space between the fields;
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/decrease.png?raw=true" alt="alt text" width="400" height="200">

6. Add a **Title** and a **Page Header**
	*	Pay attention: the Title appears on the first page and the Page Header appears on all pages;
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/staticPage.png?raw=true" alt="alt text" width="400" height="200">

7. Add pagination (Page X of Y) and the current date (Current Date) to the **Page Footer**;
8. Add into **Column Footer** and **Summary** the sum of the values for both fields to have the sum per page and have the total value on the last page;
9. Add a **Band** from the "Owner group Footer", this will make it show the expenses per owner
![decrease.png](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/addBand.png?raw=true)
10.  Add a **Report Group**, filtering the Date per month and then add the value to the **footer**
![decrease.png](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/addReportGroup.png?raw=true)
![decrease.png](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/addReportGroup2.png?raw=true)
11. You should see the fields as in the image below
![blankComplete.PNG](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/blankComplete.PNG?raw=true)

## Formatting and adjustments
### Creating a background
1. In "palette", add a rectangle to the title and change the color;
2. In "formatting tools windows" -> "adapt to parent"
3. In "Report Inspector" select the rectangle and "send to back"
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/background.png?raw=true" alt="alt text" width="700" height="200">
Result:
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/background2.png?raw=true" alt="alt text" width="700" height="200">

### Formatting to UPPERCASE
  
1. Select the field that will become "upperCase";
2. Right-click and click on "Edit expression";  
3. Select the field> add the method "toUpperCase ()";
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/uppercase.png?raw=true" alt="alt text" width="700" height="300">

### Showing the first Letter/Abbreviation
1. Select the field that will be abbreviated;
2. Right-click and click on "Edit expression";  
3. Select the field> add the method "substring (0 , 1)";
![editingQuery.PNG](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/editingQuery.PNG?raw=true)
4. Select all the fields (except by account_id and categories_id);
5. Next and Finish;
6. You should see the set up as in the image below:
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/template.png?raw=true" alt="alt text" width="700" height="300">

7. Click on **preview** to see the document.
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/preview.PNG?raw=true" alt="alt text" width="400" height="200">

## Changing the pattern

1. Select the field;
2. Go to Pattern (Text field properties);
3. Type "dd/MM/yyyy" or use the assistent clicking on "..."
![alt text](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/pattern.PNG?raw=true)

## Creating a 'blank' report!
1. Select a new 'blank' template;
2. Follow the getting started;
	* Select the fields, as the and put group by 'owner'
3. Move the fields to "Detail"
![fieldstodetails.png](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/fieldstodetails.png?raw=true)
4. Decrease the space between the fields;
![decrease.png](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/decrease.png?raw=true)
5. Add a **Title** and a **Page Header**
	*	Pay attention: the Title appears on the first page and the Page Header appears on all pages;
![decrease.png](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/staticPage.png?raw=true)
6. Add pagination (Page X of Y) and the current date (Current Date) to the **Page Footer**;
7. Add into **Column Footer** and **Summary** the sum of the values for both fields to have the sum per page and have the total value on the last page;
8. Add a **Band** from the "Owner group Footer", this will make it show the expenses per owner
![decrease.png](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/addBand.png?raw=true)
9.  Add a **Report Group**, filtering the Date per month and then add the value to the **footer**
![decrease.png](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/addReportGroup.png?raw=true)
![decrease.png](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/addReportGroup2.png?raw=true)
10. You should see the fields as in the image below
![blankComplete.PNG](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/blankComplete.PNG?raw=true)

## Formatting and adjustments
### Creating a background
1. In "palette", add a rectangle to the title and change the color;
2. In "formatting tools windows" -> "adapt to parent"
3. In "Report Inspector" select the rectangle and "send to back"
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/background.png?raw=true" alt="alt text" width="700" height="200">
Result:
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/background2.png?raw=true" alt="alt text" width="700" height="200">

### Formatting to UPPERCASE
  
1. Select the field that will become "upperCase";
2. Right-click and click on "Edit expression";  
3. Select the field> add the method "toUpperCase ()";
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/uppercase.png?raw=true" alt="alt text" width="700" height="300">

### Showing the first Letter/Abbreviation
1. Select the field that will be abbreviated;
2. Right-click and click on "Edit expression";  
3. Select the field> add the method "substring (0 , 1)";
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/abreviation.png?raw=true" alt="alt text" width="300" height="300">

### Inserting PARAMETERS
1. <img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/parameter.png?raw=true" alt="alt text" width="600" height="300">
2. <img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/parameter2.png?raw=true" alt="alt text" width="500" height="300">

## Generating a PDF report from a 'main' method

1. To generate a PDF, it will be necessary to compile the files .jrxml (iReport) to .jasper (ReportEngine).
2. Create a Simple Java Project;
3. Download the  [MySQL connector](https://github.com/igorgrv/JasperReport/blob/master/SpendPerMonth_chart/SpendPerMonth/lib/mysql-connector-java-5.1.28-bin.jar);
4. Open the folder _"iReport-5.6.0\ireport\modules\ext"_ and find the jars bellow. Paste into the project folder "lib" and "add to build path" :
	  * itext
	  * jasperreports-5.6.0
	  * fjreechart
	  * jcommon
	  * commons-beanutils
	  * commons-collections
	  * commons-logging
5. Add the file "SpendPerMonth.jrxml" inside the project folder (it's not inside the "lib" folder)

6. Create the class ConnectionFactory
```java
public class ConnectionFactory {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/jasperreport", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
```
7. Create another class that will be responsible for generating the PDF.
	  * **BEFORE**, it's necessary to change the language from "Groovy" to "Java" - to do that, open the .jrxml file and search for "language"
```java
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
```
#### Understanding the code
*  **JasperCompileManager** is the class responsible for compiling the jrxml file;
   * Method **compileReportToFile** receives the .jrxml _(need to handle the JRException exception)_

* **JasperFillManager** is the class responsible for filling out the report, which will return a **JasperPrint**
   * The **fillReport** method receives:
     * Jasper file: "SpendPerMonth.jasper"
     * Parameter: As this example has no parameters, we will declare it as null;
     * Connection;
    
* To export to PDF, just use the class **JasperExportManager**, sending JasperPrint and the name of the file.

## Encapsulating the PDF Generator

Just create a class with the methods and call it in a "main" class;
```java
public class ReportGenerator {

	private String jasperName;
	private Map<String, Object> parameter;
	private Connection connection;
	
	//constructor
	public ReportGenerator(String jasperName, Map<String, Object> parameter, Connection connection) {
		this.jasperName = jasperName;
		this.parameter = parameter;
		this.connection = connection;
	}
	
	//method
	public void ReportGeneratorPDF(String PDFname) {
		try {
			JasperPrint jasperPrint = JasperFillManager.fillReport(this.jasperName, this.parameter, this.connection);
			
			JasperExportManager.exportReportToPdfFile(jasperPrint, PDFname);
		} catch (JRException e) {
			e.printStackTrace();
		}
	}	
}
```
Main method:
```java
public class ReportGeneratorTest {

	public static void main(String[] args) throws JRException {
		
//		JasperCompileManager.compileReportToFile("SpendPerMonth.jrxml");
		
		String jasperName = "SpendPerMonth";
		Map<String, Object> parameter = new HashMap<String, Object>();
		Connection connection = new ConnectionFactory().getConnection();
		
		ReportGenerator generator = new ReportGenerator(jasperName + ".jasper", parameter, connection);
		generator.ReportGeneratorPDF(jasperName+ ".pdf");
	}
}
```


## <details>JasperReport WEBServlet - PDF<summary> </summary>


![reportWeb.PNG](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/reportWeb.PNG?raw=true)

ReportServlet:
```java
@WebServlet("/transactions")
public class ReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//Because the .jasper is inside the folder "jasper", we need to use the method .getRealPath
			String name = request.getServletContext().getRealPath("WEB-INF/jasper/SpendPerMonth.jasper") ;
			
			Map<String, Object> parameter = new HashMap<String, Object>();
			Connection connection = new ConnectionFactory().getConnection();
			
			//Mapping the parameters from the form
			String startDate = request.getParameter("start_date");
			String endDate = request.getParameter("end_date");
			String type = request.getParameter("type");
			
			//Transforming the string provides from the form, to Date
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date startDateParse = sdf.parse(startDate);
			Date endDateParse = sdf.parse(endDate);
			
			//Mapping the parameters from the iReport
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
```
ReportGenerator:
```java
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
```
form.jsp:
```html
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
</head>
<body>

<form action="transactions" method="POST">
	<h1>Report</h1>
	Start Date: <input type="text" name="start_date"> <br/>
	End Date: <input type="text" name="end_date"> <br/>
	<br/>
	Search by the transaction type: <br>
    <input type="radio" name="type" value="ENTRADA" checked="checked">Cash in
    <input type="radio" name="type" value="SAIDA">Cash out<br>

    <br>
	<input type="submit" value="Generate your report!" />

</form>
</body>
</html>
```
</details>
