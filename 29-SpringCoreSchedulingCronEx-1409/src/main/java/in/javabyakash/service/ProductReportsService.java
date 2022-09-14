package in.javabyakash.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProductReportsService {
	
	//@Scheduled(cron = "*/10 * * * * *")
	//@Scheduled(cron = "10 * * * * *")
	@Scheduled(cron = "0 0/2 * * * *")
	public void m1() {
		System.out.println("HELLO "+new Date());
	}
}
