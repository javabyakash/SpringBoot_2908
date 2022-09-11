package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.config.ConfigApp;
import in.javabyakash.controller.EmpController;

public class ContainerApp {
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigApp.class);
		
		//read object from container
		EmpController controller = ac.getBean("empController",EmpController.class);
		controller.getServiceMsg();
	}
}
