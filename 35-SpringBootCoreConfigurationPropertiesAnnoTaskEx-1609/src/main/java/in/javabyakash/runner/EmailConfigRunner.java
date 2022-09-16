package in.javabyakash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.javabyakash.bean.EmailConfig;

@Component
public class EmailConfigRunner implements CommandLineRunner {

	@Autowired
	private EmailConfig config;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(config);
	}

}
