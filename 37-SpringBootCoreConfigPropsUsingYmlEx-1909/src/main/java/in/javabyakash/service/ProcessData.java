package in.javabyakash.service;

public class ProcessData {
	private Integer pid;
	private String pname;

	public ProcessData() {
		super();
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "ProcessData [pid=" + pid + ", pname=" + pname + "]";
	}

}
