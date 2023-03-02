Vaadin7 Spring Application to Vaadin23 using MPR 
======================

This project contains the source code for the tutorial for using MPR to migrate a spring boot, Vaadin7 application to a Spring boot, Vaadin 23 application.

## Running the project from command line

Run `mvn clean install spring-boot:run` in the project root directory. After the server has started point your browser to [http://localhost:8080](http://localhost:8080) to see the resulting application.

## Updating the pom.xml
#####1. Update spring-boot-starter-parent version 
![spring-boot-starter-parent](readmeImages/springBootVersion.png)

#####2. Add two different Vaadin versions to the <properties>
![vaadinVersion](readmeImages/vaadinVersion.png)

#####3. Update Vaadin-bom version and add jna to <dependencyManagement>
![dependencyManagement](readmeImages/dependencyManagement.png)

#####4. Add vaadin-server, vaadin-theme dependency with version7 and exclude gwt dependency from vaadin-server
![vaadin-server](readmeImages/vaadin-server.png)

#####5. Add vaadin-client AND vaadin-client-compiler with version7(exclude gwt-elemental dependency) 
![vaadin-client](readmeImages/vaadin-client.png)
![vaadin-client-compiler](readmeImages/vaadin-client-compiler.png)

#####6. Add vaadin-core dependency and exclude gwt-elemental dependency
![vaadin-core](readmeImages/vaadin-core.png)

#####7 Add mpr-V7 dependency
![mpr](readmeImages/mpr.png)

#####8 Add dependencies for gwtelemental, gw+dev and gwt+user and version should be 2.8.2
![gwt](readmeImages/gwt.png)

#####9 Add vaadin-maven-plugin with version7 and delete <goal>compile</goal>
![vaadin-maven-plugin](readmeImages/vaadin-maven-plugin.png)

#####10 Add gwt-maven-plugin to compile the Widgetset
![gwt-maven-plugin](readmeImages/gwt-maven-plugin.png)

#####11 Add flow-maven-plugin to generate frontend
![flow-maven-plugin](readmeImages/flow-maven-plugin.png)

#####12. Add maven-jar-plugin
![maven-jar-plugin](readmeImages/maven-jar-plugin.png)

run mvn clean install and on success there should be a file  AppWidgetset in \target\classes\VAADIN\widgetsets







