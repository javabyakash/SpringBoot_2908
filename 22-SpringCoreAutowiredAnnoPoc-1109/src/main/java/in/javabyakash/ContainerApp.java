package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.javabyakash.bean.Vehicle;
import in.javabyakash.config.ConfigApp;

public class ContainerApp {
	public static void main(String[] args) {

		// create IOC container
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigApp.class);

		// read object from container
		Vehicle vehicle = ac.getBean("vehicle", Vehicle.class);
		System.out.println(vehicle);

	}
}
