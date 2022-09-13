package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.bean.Employee;
import in.javabyakash.config.AppConfig;

public class ContainerApp {
	public static void main(String[] args) {
		//create IOC container 
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get object from container
		Employee emp = ac.getBean(Employee.class);
		
		System.out.println(emp);
	}
}
