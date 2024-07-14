package config;

import main.Parrot;
import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    public Person person1() {
        Person p = new Person();
        p.setName("Ella1");
        p.setParrot(parrot());
        return p;
    }
    @Bean(name = "person2")
    public Person person2(Parrot parrot) {
        Person p = new Person();
        p.setName("Ella2");
        p.setParrot(parrot);
        return p;
    }
}
