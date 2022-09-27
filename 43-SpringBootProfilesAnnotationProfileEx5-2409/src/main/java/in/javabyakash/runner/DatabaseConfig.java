package in.javabyakash.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = { "default", "qa" })
public class DatabaseConfig implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM DATABASE CONFIG!");
	}

}
