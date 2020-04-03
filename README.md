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
