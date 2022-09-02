package in.akash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.akash.controller.UserController;

public class ContainerClass {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ac = new ClassPathXmlApplicationContext("AppConfig.xml");
		//read object from container
		UserController bean = (UserController)ac.getBean("controller");
		//print object
		System.out.println(bean);
	}
}
