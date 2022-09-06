package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.config.ConfigApp;
import in.javabyakash.controller.MyController;

public class ContainerApp {
	public static void main(String[] args) {
		//create IOC Container
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigApp.class);
		MyController controller = ac.getBean("controller",MyController.class);
		System.out.println(controller);
	}
}
