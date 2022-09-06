package in.javabyakash;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.javabyakash.service.ExcelExportService;

public class ContainerApp {
	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		// get bean
		ExcelExportService exportService = ac.getBean("excel", ExcelExportService.class);
		// print object
		System.out.println(exportService);
		ac.close();
	}
}
