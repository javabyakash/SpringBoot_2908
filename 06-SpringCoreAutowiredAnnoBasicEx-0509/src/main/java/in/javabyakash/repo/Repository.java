package in.javabyakash.repo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("repo")
public class Repository {
	@Value("SAMPLE")
	private String entity;

	public Repository() {
		super();
	}

	@Override
	public String toString() {
		return "Repository [entity=" + entity + "]";
	}

}
