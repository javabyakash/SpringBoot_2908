package in.javabyakash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import in.javabyakash.repo.MyRepository;

@Component("service")
public class MyService {
	
	@Autowired
	private MyRepository repo;

	public MyService() {
		super();
	}

	@Override
	public String toString() {
		return "MyService [repo=" + repo + "]";
	}

}
