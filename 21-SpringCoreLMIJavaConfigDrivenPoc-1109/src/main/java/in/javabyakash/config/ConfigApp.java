package in.javabyakash.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

import in.javabyakash.bean.Address;

@Configuration
@ComponentScan(basePackages = "in.javabyakash.bean")
@PropertySource("classpath:myapp.properties")
public class ConfigApp {

	@Autowired
	private Environment env;

	@Bean
	@Scope("prototype")
	public Address getAddrs() {
		System.out.println("ConfigApp.getAddrs()");
		Address addrs = new Address();
		addrs.setCity(env.getProperty("my.app.city"));
		addrs.setPinCode(Integer.parseInt(env.getProperty("my.app.pin-code")));
		return addrs;
	}
}
