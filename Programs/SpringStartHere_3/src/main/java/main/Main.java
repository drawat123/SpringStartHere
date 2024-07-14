package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person1 =
                context.getBean("person1",Person.class);
        Person person2 =
                context.getBean("person2",Person.class);
        Parrot parrot =
                context.getBean(Parrot.class);
        System.out.println(
                "Person1's name: " + person1.getName());
        System.out.println(
                "Person2's name: " + person2.getName());
        System.out.println(
                "Parrot's name: " + parrot.getName());
        System.out.println(
                "Person1's parrot: " + person1.getParrot());
        System.out.println(
                "Person2's parrot: " + person2.getParrot());
    }
}