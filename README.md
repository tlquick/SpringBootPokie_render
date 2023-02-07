## Spring Boot Pokie
A project that takes a small Java GUI enterprise application (from an existing BlueJ project) and creates a web app using Spring Boot, HTMX and RPC (RESTful endpoints) in Eclipse
## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Example Use](#example-use)

## General Info
The aim of this project is to transform an enterprise application into a web app that can be built in continuous integration by Jenkins in a Docker container. This project will also include basic JUnit and Selenium tests to ensure each iteration does not break the product. Thymeleaf + HTMX will be used to make the front end snappy. <br>
<b>Tasks to complete: </b><br>
Step 1: get existing models to compile and run in Springboot starter<br>
Step 2: write some unit tests in JUnit <br>
Step 3: complete the backend <br>
Step 4: write the front end in thymeleaf, use basic HTMX to increase efficiency <br>
Step 5: setup CI/CD using Docker to host Jenkins, Maven and some basic selenium tests
<br>
## Technologies
Spring Boot 3.0, Maven, Java 17, HTMX, JUnit, Selenium, Jenkins and Docker Desktop <br>
<br>
POM dependancies: spring-boot-starter-parent version 2.75, spring-boot-starter-web, spring-boot-starter-web-services, spring-boot-starter-thymeleaf, htmx.org 1.6.0, spring-boot-starter-test, junit-jupiter-api and selenium-java 4.5.3 <br>
## Setup
Docker Desktop needs to be installed on the target environment. Jenkins needs to be installed inside the target Docker container. <br>
Every git push will cause Jenkins to checkout the new changes, compile the project with Maven, run the JUnit tests, Build and install the package then run the Selenium tests
## Example Use
The Pokie app loads, displaying the Pokie app <br>
![PokieStart](/pokie_load.jpg?raw=true "Home Page") <br>
The user adds credits, selects the number of lines and credits, then clicks Spin.
The web app randomly determines the result of the spin, calcuating any payouts and updates the Player balance
![PokieRun](/pokie_example.jpg?raw=true "Example") <br>. 
