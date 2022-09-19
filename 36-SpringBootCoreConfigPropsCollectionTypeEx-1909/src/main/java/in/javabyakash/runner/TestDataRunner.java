package in.javabyakash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.javabyakash.service.MyServiceData;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private MyServiceData data;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(data);
	}

}
