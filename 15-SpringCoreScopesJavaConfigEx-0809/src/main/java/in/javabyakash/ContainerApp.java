package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.bean.Token;
import in.javabyakash.config.ConfigApp;

public class ContainerApp {
	public static void main(String[] args) {
		System.out.println("BEFORE CONTAINER CREATION!");
		//Create IOC container
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigApp.class);
		System.out.println("AFTER CONTAINER CREATED!");
		
		//Read Object from IOC container
		Token tok1 = ac.getBean("token",Token.class);
		System.out.println(tok1.hashCode());
		
		Token tok2 = ac.getBean("token",Token.class);
		System.out.println(tok2.hashCode());
	}
}
