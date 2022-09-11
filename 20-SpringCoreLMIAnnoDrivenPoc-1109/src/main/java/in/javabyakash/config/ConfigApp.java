package in.javabyakash.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "in.javabyakash")
@PropertySource("classpath:myapp.properties")
public class ConfigApp {

}
