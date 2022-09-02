package in.akash.service;

import in.akash.repo.UserRepo;

public class UserService {
	private UserRepo userRepo;

	public UserService() {
		super();
	}

	public UserRepo getUserRepo() {
		return userRepo;
	}

	public void setUserRepo(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public String toString() {
		return "UserService [userRepo=" + userRepo + "]";
	}

}
