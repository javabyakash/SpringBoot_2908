package in.javabyakash.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages = "in.javabyakash")
@EnableScheduling
public class AppConfig {

}
