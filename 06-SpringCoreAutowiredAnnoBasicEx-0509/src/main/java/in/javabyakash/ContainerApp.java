package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.config.AppConfig;
import in.javabyakash.service.Service;

public class ContainerApp {
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get spring bean class object from container
		Service service = ac.getBean("service",Service.class);
		
		//print the target class object
		System.out.println(service);
	}
}
