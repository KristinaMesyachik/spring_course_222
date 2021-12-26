package by.overone.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("by.overone.spring")
@PropertySource("classpath:myApplication.properties")
public class MyConfig {
}
