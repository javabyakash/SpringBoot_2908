package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.javabyakash.bean.Employee;

public class ContainerApp {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = ac.getBean("e1",Employee.class);
		System.out.println(emp);
	}
}
