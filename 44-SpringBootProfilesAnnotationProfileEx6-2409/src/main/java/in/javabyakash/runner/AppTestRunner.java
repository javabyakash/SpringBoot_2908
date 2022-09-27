package in.javabyakash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.javabyakash.dao.IEmployeeDao;

@Component
public class AppTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeDao dao;

	@Override
	public void run(String... args) throws Exception {
		dao.showDbConfig();
	}

}
