package in.javabyakash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import in.javabyakash.bean.Token;

@ComponentScan(basePackages = "in.javabyakash")
@Configuration
public class ConfigApp {

	@Bean
	public Token token() {
		System.out.println("ENTERED INTO BEAN MEATHOD!");
		Token tok = new Token();
		tok.setCode(456);
		System.out.println("ABOUT TO EXIT BEAN MEATHOD!");
		return tok;
	}
}
