package in.javabyakash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.javabyakash.repo.Repository;

@Component("service")
public class Service {

	@Autowired
	private Repository repo;

	public Service() {
		super();
	}

	@Override
	public String toString() {
		return "Service [repo=" + repo + "]";
	}

}
