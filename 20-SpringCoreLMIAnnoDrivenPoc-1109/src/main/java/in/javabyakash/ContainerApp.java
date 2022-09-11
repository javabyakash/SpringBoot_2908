package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.bean.Address;
import in.javabyakash.bean.Student;
import in.javabyakash.config.ConfigApp;

public class ContainerApp {
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigApp.class);
		
		//read object from container
		Student st1 = ac.getBean("student",Student.class);
		Address addrs1 = st1.getAddress();
		System.out.println(st1.hashCode()+" <---------------> "+addrs1.hashCode());
		
		Student st2 = ac.getBean("student",Student.class);
		Address addrs2 = st2.getAddress();
		System.out.println(st2.hashCode()+" <---------------> "+addrs2.hashCode());
		
		Student st3 = ac.getBean("student",Student.class);
		Address addrs3 = st3.getAddress();
		System.out.println(st3.hashCode()+" <---------------> "+addrs3.hashCode());
		
	}
}
