package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        Parrot x = new Parrot();

        Supplier<Parrot> parrotSupplier = () -> x;

        context.registerBean("parrot1", Parrot.class, parrotSupplier);

        p = context.getBean("parrot1", Parrot.class);

        x.setName("KiKi");

        System.out.println(p.getName());
    }
}
