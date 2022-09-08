package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.bean.Token;
import in.javabyakash.config.AppConfig;

public class ContainerApp {
	public static void main(String[] args) {
		System.out.println("BEFORE IOC CONTAINER CREATION!");
		// create IOC container
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("AFTER IOC CONTAINER CREATED!");

		// Read Object From IOC Container
		Token tok1 = ac.getBean("token", Token.class);
		System.out.println(tok1.hashCode() + "------" + tok1);

		// Read Object From IOC Container
		Token tok2 = ac.getBean("token", Token.class);
		System.out.println(tok2.hashCode() + "------" + tok2);

	}
}
