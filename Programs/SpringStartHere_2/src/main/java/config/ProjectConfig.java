package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:app.properties"/*, ignoreResourceNotFound = true*/)
@ComponentScan(basePackages = "main")
public class ProjectConfig {
}
