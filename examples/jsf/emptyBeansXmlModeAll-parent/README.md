Weld emptyBeansXmlModeAll Example
==================

Build and deploying
---------------------

1. Build example using command

        mvn clean install -pl .,service-api,service-impl

2. Deploy example to the server you have started in step 1 using command

        mvn clean package -pl webapp
