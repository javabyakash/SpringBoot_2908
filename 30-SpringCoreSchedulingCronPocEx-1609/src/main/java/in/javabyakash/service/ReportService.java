package in.javabyakash.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportService {
	
	@Scheduled(cron = "*/20 * * * * *")
	public void generateReport() {
		System.out.println("REPORT GENERATE AT : " + new Date());
	}
}
