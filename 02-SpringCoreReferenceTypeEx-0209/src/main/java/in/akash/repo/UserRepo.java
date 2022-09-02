package in.akash.repo;

public class UserRepo {
	private String name;
	private String email;
	private Long mobile;

	public UserRepo() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "UserRepo [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}

}
