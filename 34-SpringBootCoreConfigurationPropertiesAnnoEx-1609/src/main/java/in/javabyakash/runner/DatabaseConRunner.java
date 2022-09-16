package in.javabyakash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.javabyakash.bean.DatabaseCon;

@Component
public class DatabaseConRunner implements CommandLineRunner {
	@Autowired
	private DatabaseCon con;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(con);
	}

}
