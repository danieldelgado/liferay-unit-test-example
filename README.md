Unit Testing Demo
=================

A Liferay Spring Portlet MVC project template using Maven.

* Liferay EE 6.1.20
* Java 1.6
* Portlet 2.0
* Spring Framework 3.2.3
* Annotation-based controller configuration

Unit test examples include:

* Stock JUnit
* Spring Test
* Mockito
* PowerMock (Mockito extension)

Usage
-----
```bash
$ git clone https://github.com/psvehla/liferay-unit-test-example.git
$ cd liferay-unit-test-example
$ mvn package
```

Deploy
------
If you're using Liferay Portal with Tomcat, copy the war to the deploy directory.

```
$ cp target/liferay-unit-test-example.war $LIFERAY_HOME/deploy/
```

Configuration
-------------

Default settings are Liferay EE 6.1.20, Java 1.6, Portlet 2.0, and Spring 3.2.  All can be configured in [pom.xml](https://github.com/psvehla/liferay-unit-test-example/pom.xml)

```xml
	<properties>
		<liferay.version>6.1.20</liferay.version>
		<java-version>1.6</java-version>
		<portlet-api.version>2.0</portlet-api.version>
		<servlet-api.version>2.5</servlet-api.version>
		<jsp-api.version>2.2</jsp-api.version>
		<jstl.version>1.2</jstl.version>
		<org.springframework-version>3.2.3.RELEASE</org.springframework-version>
		<org.aspectj-version>1.7.3</org.aspectj-version>
		<org.slf4j-version>1.7.5</org.slf4j-version>
	</properties>
```

Licence
-------

Copyright 2013 Red Barn Consulting

Licenced under the LGPL Licence, Version 3.0: http://www.gnu.org/licenses/lgpl.html
