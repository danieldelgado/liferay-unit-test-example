Unit Testing Demo
=================

A unit testing demo using the frameworks that Liferay use for unit testing under the hood: JUnit, with Mockito for a mocking framework and PowerMock (Mockito API) for mocking static methods.

* Liferay EE 6.2.10 SP7
* Java 1.7
* Portlet 2.0
* Spring Framework 4.1.1
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

Default settings are Liferay EE 6.2.10 SP7, Java 1.7, Portlet 2.0, and Spring 4.1.  All can be configured in [pom.xml](https://github.com/psvehla/liferay-unit-test-example/pom.xml)

```xml
	<properties>
		<liferay.version>6.2.10.8</liferay.version>
		<java-version>1.7</java-version>
		<portlet-api.version>2.0</portlet-api.version>
		<servlet-api.version>2.5</servlet-api.version>
		<jsp-api.version>2.2</jsp-api.version>
		<jstl.version>1.2</jstl.version>
		<org.springframework-version>4.1.1.RELEASE</org.springframework-version>
		<org.aspectj-version>1.8.2</org.aspectj-version>
		<org.slf4j-version>1.7.7</org.slf4j-version>
	    <powermock.version>1.5.6</powermock.version>
	</properties>
```

Licence
-------

Copyright 2014 Red Barn Consulting

Licenced under the LGPL Licence, Version 3.0: http://www.gnu.org/licenses/lgpl.html
