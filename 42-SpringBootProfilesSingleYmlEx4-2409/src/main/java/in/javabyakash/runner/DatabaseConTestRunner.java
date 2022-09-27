package in.javabyakash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.javabyakash.dbcon.DatabaseCon;

@Component
public class DatabaseConTestRunner implements CommandLineRunner {

	@Autowired
	private DatabaseCon dbCon;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(dbCon);
	}

}
