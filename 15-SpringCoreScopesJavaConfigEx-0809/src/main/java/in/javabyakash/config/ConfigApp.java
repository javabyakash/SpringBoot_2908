package in.javabyakash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import in.javabyakash.bean.Token;

@Configuration
public class ConfigApp {
	
	/**
	 * If we want to force Container to behave Lazy for Singleton beans then use below @Lazy Annotation on top of bean 
	 * @Lazy
	 */
	@Bean
	@Scope("prototype")
	public Token token() {
		return new Token();
	}
}
