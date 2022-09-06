package in.javabyakash;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.javabyakash.service.ExcelExportService;

public class ContainerApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		ExcelExportService excel = ac.getBean("excel", ExcelExportService.class);
		System.out.println(excel);
		ac.close();
	}
}
