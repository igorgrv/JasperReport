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
4. Select all the fields (except by account_id and categories_id);
5. Next and Finish;

### PICTURE OF THE QUERY editingQuery

You may see this setup
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/template.png?raw=true" alt="alt text" width="700" height="300">

**Preview**
Click on preview to see the document.
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/preview.PNG?raw=true" alt="alt text" width="400" height="200">

## Changing the pattern

1. Select the field;
2. Go to Pattern (Text field properties);
3. Type "dd/MM/yyyy" or use the assistent clicking on "..."
![alt text](https://github.com/igorgrv/JasperReport/blob/master/readmeImages/pattern.PNG?raw=true)

## Creating a 'blank' report!
1. Select a new 'blank' template;
2. Follow the getting started;
	* Select the fields, as the image bellow and group by 'owner'
	* ### IMAGE WITH THE fieldstodetails.PNG
3. Move the fields to "Detail"
4. Decrease the space between the fields;
	### IMAGE WITH THE decrease.PNG
5. Add a **Title** and a **Page Header**
	*	Pay attention: the Title** appears on the first page and the Page Header appears on all pages;
	*	### IMAGE WITH THE PageStatic.PNG
6. Add pagination (Page X of Y) and the current date (Current Date) to the **Page Footer**;
7. Add into **Column Footer** and **Summary** the sum of the values for both fields to have the sum per page and have the total value on the last page;