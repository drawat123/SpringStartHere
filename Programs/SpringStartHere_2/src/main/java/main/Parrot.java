package main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Parrot {
    private String name;

    public String getName() {
        return name;
    }

    @Value("${temp.tempvalue}")
    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        System.out.println("Parrot Obj Created: " + this);
    }

    @PreDestroy
    public void d() {

    }
}
