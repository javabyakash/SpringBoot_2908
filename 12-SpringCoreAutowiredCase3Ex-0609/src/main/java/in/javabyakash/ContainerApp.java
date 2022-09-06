package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.config.AppConfig;
import in.javabyakash.service.MyService;

public class ContainerApp {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		MyService service = ac.getBean("service",MyService.class);
		System.out.println(service);
	}
}
