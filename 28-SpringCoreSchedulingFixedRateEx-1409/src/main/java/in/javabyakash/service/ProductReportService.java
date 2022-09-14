package in.javabyakash.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProductReportService {

	@Scheduled(fixedRate = 1000)
	public void m1() {
		System.out.println("HELLO " + new Date());
	}
	
}
