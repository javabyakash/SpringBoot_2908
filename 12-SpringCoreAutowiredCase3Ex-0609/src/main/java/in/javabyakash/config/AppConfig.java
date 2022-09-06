package in.javabyakash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import in.javabyakash.repo.MyRepository;

@Configuration
@ComponentScan(basePackages = "in.javabyakash")
public class AppConfig {

	@Bean
	public MyRepository getRepo() {
		MyRepository repo = new MyRepository();
		repo.setCode("SAMPLE");
		return repo;
	}

	@Bean
	@Primary
	public MyRepository getRepo1() {
		MyRepository repo = new MyRepository();
		repo.setCode("SAMPLE_REPO");
		return repo;
	}
}
