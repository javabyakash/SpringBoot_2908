package in.javabyakash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.javabyakash.service.MyServiceData;

@Component
public class TestAppRunner implements CommandLineRunner {

	@Autowired
	private MyServiceData service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(service);
	}

}
