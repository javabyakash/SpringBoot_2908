package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.bean.Address;
import in.javabyakash.bean.Developer;
import in.javabyakash.config.ConfigApp;

public class ContainerApp {
	public static void main(String[] args) {
		System.out.println("Before Container Create!");
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigApp.class);
		System.out.println("After Container Created!");

		Developer dev1 = ac.getBean("developer", Developer.class);
		Address addrs1 = dev1.getAddrs();
		System.out.println(dev1.hashCode() + " <-------------> " + addrs1.hashCode());

		Developer dev2 = ac.getBean("developer", Developer.class);
		Address addrs2 = dev2.getAddrs();
		System.out.println(dev2.hashCode() + " <-------------> " + addrs2.hashCode());

		Developer dev3 = ac.getBean("developer", Developer.class);
		Address addrs3 = dev3.getAddrs();
		System.out.println(dev3.hashCode() + " <-------------> " + addrs3.hashCode());

	}
}
