package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.javabyakash.bean.Address;
import in.javabyakash.bean.Employee;

public class ContainerApp {
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		//read object from container
		Employee emp1 = ac.getBean("employee",Employee.class);
		Address addrs1 = emp1.getAddress();
		System.out.println(emp1.hashCode()+" <----------------> "+addrs1.hashCode());
		
		Employee emp2 = ac.getBean("employee",Employee.class);
		Address addrs2 = emp1.getAddress();
		System.out.println(emp2.hashCode()+" <----------------> "+addrs2.hashCode());
	}
}
