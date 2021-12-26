package by.overone.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApplication.properties")
public class MyConfig_2 {
    @Bean
    public Pet dog(){
        return new Dog();
    }

    @Bean
    public Person myPerson(){
        return new Person(dog());
    }
}
