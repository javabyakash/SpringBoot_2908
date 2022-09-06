package in.javabyakash;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.javabyakash.config.AppConfig;
import in.javabyakash.service.ExcelExportService;

public class ContainerApp {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ExcelExportService excel = ac.getBean("excel", ExcelExportService.class);
		System.out.println(excel);
		ac.close();
	}
}
