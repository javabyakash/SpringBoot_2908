package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.config.AppConfig;
import in.javabyakash.service.ProductReportService;

public class ContainerApp {
	public static void main(String[] args) {
		//creating IOC container
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//read object from IOC container
		ProductReportService reportService = ac.getBean(ProductReportService.class);
	}
}
