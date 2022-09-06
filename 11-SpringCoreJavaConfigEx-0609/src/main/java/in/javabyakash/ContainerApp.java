package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.bean.DriverCon;
import in.javabyakash.config.AppConfig;

public class ContainerApp {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		DriverCon driverCon = ac.getBean("driverCon",DriverCon.class);
		System.out.println(driverCon);
	}
}
