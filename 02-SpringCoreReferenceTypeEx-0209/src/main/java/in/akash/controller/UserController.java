package in.akash.controller;

import in.akash.service.UserService;

public class UserController {
	private UserService userService;

	public UserController() {
		super();
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String toString() {
		return "UserController [userService=" + userService + "]";
	}

}
