package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ella";

    @Autowired
    private Parrot parrot1;

    private final Parrot parrot2;

    @Autowired
    public Person(Parrot parrot) {
        this.parrot2 = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot1() {
        return parrot1;
    }

    public void setParrot1(Parrot parrot) {
        this.parrot1 = parrot;
    }

    public Parrot getParrot2() {
        return parrot2;
    }
}
