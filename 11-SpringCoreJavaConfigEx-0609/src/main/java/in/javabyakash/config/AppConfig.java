package in.javabyakash.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import in.javabyakash.bean.DriverCon;

@PropertySource("classpath:application.properties")
@Configuration
public class AppConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public DriverCon driverCon() {
		DriverCon driverCon = new DriverCon();
		driverCon.setUrl(env.getProperty("com.javabyakash.url"));
		driverCon.setDriver(env.getProperty("com.javabyakash.driver"));
		return driverCon;
	}
}
