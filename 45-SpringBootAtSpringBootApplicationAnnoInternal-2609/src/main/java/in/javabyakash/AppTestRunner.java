package in.javabyakash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.app.config.DBCon;
import in.javabyakash.bean.Employee;

@Component
public class AppTestRunner implements CommandLineRunner {

	@Autowired
	private Employee emp;
	
	@Autowired(required = false)
	private DBCon con;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(emp);
		System.out.println(con);
	}

}
