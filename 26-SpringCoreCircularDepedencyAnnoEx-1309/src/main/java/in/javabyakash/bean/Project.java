package in.javabyakash.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("proj")
public class Project {
	@Value("MCS")
	private String projectName;

	@Autowired
	private Employee emp;

	public Project() {
		super();
		System.out.println("FROM PROJECT CONSTRUCTOR");
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		System.out.println("FROM PROJECT SETTER");
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

}
