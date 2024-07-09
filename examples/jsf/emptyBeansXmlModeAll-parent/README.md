Weld emptyBeansXmlModeAll Example
==================

Deploying to WildFly (Preview 26.1.3.Final)
---------------------

Make sure you have assigned the absolute path of your installation to the
`JBOSS_HOME` environment variable.

1. Open terminal and start the server by running script:

        $JBOSS_HOME/bin/standalone.sh

2. Build example using command

        mvn clean install

3. Deploy example to the server you have started in step 1 using command

        mvn wildfly:deploy -pl webapp
