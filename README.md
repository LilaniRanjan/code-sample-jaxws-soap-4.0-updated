### Code Sample for Java JAX-WS using Amadeus SOAP header 4.0



## Requirements

* [Java Platform JDK 1.7](http://www.oracle.com/technetwork/java/javase/downloads/index.html) or higher. Also, please ensure JAVA_HOME environment variable is correctly defined.
* [Maven 3.3.x](https://maven.apache.org/download.cgi) or higher
* [Git 1.9.x](https://git-scm.com/downloads) or higher

## Setup

Generate wsdl2java proxy code and compile all classes:

```
$ mvn compile
```

Execute code sample:

```
$ mvn exec:exec
```

Packaging code sample to share with customers:

```
$ mvn package
```

You can find the resulting .zip file in ./target

## Configuration

Access src/main/resources/amadeus.WSAP.configuration.properties to setup the WSAP credentials defined for your application. 

## Logging

By default, this application is using Log4J2 and outputting logging data to both STDOUT (Console) and logs/app.log file.

To change logging settings, please access src/main/resources/log4j2.xml

## Known issues

* NA
