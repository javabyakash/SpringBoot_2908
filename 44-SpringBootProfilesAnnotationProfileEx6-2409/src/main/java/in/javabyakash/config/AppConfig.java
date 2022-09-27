package in.javabyakash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import in.javabyakash.dao.EmployeeOracleDaoImpl;

@Configuration
public class AppConfig {

	@Bean
	@Profile(value = { "uat", "prod" })
	public EmployeeOracleDaoImpl getOracleDaoObject() {
		return new EmployeeOracleDaoImpl();
	}
}
