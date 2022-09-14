package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.config.AppConfig;
import in.javabyakash.service.ReportService;

public class ContainerApp {
	public static void main(String[] args) {
		//create IOC container 
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//read object from container
		ReportService service = ac.getBean(ReportService.class);
	}
}
