# Performio

Language Used  - Java
Framework Used  - Page Factory model
Library used for UI tests - Selenium Web-driver 3
Other tools used - Maven , TestNG

How to Run:
===========

1) Download and install Java and Maven
2) Clone the repo
3) Go into the project and run

> mvn test ( to run all tests )
> mvn clean verify to run all tests and generate a html report
> mvn -Dtest= <Test Name> ( to run a single test )


Improvements that can be done
=============================

Add logic around updating chromedriver and firefox driver .
Logic around selection of browser from the run command
Hook it up to Jenkins for running it with continous integration
