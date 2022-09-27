package in.javabyakash;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);

		// We can disable this banner code using this:
		/*
		SpringApplication sa = new SpringApplication(Application.class);
		sa.setBannerMode(Mode.OFF);
		sa.run(args);
		*/
	}

}
