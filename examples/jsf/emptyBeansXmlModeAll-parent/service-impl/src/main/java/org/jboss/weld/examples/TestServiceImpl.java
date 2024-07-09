package org.jboss.weld.examples;

public class TestServiceImpl implements TestService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
