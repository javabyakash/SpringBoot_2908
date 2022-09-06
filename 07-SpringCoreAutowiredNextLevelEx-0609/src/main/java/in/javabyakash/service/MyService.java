package in.javabyakash.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("service")
public class MyService {

	@Value("SAMPLE-DATA")
	private String entity;

	public MyService() {
		super();
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	@Override
	public String toString() {
		return "MyService [entity=" + entity + "]";
	}

}
