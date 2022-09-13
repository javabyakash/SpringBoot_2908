package in.javabyakash.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	@Value("Akash")
	private String ename;

	@Autowired
	private Project proj;

	public Employee() {
		super();
		System.out.println("FROM EMPLOYEE CONSTRUCTOR");
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
		System.out.println("FROM EMPLOYEE SETTER");
	}

	public Project getProj() {
		return proj;
	}

	public void setProj(Project proj) {
		this.proj = proj;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", proj=" + proj + "]";
	}

}
