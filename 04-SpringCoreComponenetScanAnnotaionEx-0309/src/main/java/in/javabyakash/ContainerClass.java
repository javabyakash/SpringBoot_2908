package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.akash.User;
import in.javabyakash.bean.ViewResolver;
import in.javabyakash.config.AppConfig;
import in.javabyakash.config.EmailConfig;

public class ContainerClass {
	public static void main(String[] args) {
		// crate IOC container
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		// get bean class object
		EmailConfig ec = ac.getBean("email", EmailConfig.class);
		System.out.println(ec);
		ViewResolver vr = ac.getBean("vr", ViewResolver.class);
		System.out.println(vr);
		User user = ac.getBean("user",User.class);
		System.out.println(user);
	}
}
