package in.javabyakash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.DatabaseConnection;
import in.javabyakash.config.MyAppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		DatabaseConnection dc = ac.getBean("dbcon",DatabaseConnection.class);
		System.out.println(dc);
	}
}
