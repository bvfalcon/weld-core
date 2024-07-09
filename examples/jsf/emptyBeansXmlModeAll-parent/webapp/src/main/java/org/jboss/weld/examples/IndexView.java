package org.jboss.weld.examples;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("index")
@ApplicationScoped
public class IndexView {

    private String name;
    private String result;

    @Inject
    private TestService service;

    public void sayHello() {
        result = service.sayHello(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
