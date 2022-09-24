package in.javabyakash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.javabyakash.dbcon.DatabaseConnection;

@Component
public class AppTestRunner implements CommandLineRunner {

	@Autowired
	private DatabaseConnection dbCon;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(dbCon);
	}
}
