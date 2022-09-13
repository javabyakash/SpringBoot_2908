package in.javabyakash.bean;

public class Project {
	private String projName;
	private Employee emp;

	public Project() {
		super();
		System.out.println("FROM PROJECT CONSTRUCTOR!");
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
		System.out.println("FROM PROJECT SETTER!");
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

}
