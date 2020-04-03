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
3. Select all the fields (except by account_id and categories_id);
4. Next and Finish;

<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/template.png?raw=true" alt="alt text" width="700" height="300">

**Preview**
<img src="https://github.com/igorgrv/JasperReport/blob/master/readmeImages/preview.PNG?raw=true" alt="alt text" width="500" height="300">