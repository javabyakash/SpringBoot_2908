package in.javabyakash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.javabyakash.service.MyService;

@Component("controller")
public class MyController {
	@Autowired(required = false)
	private MyService service;

	public MyController() {
		super();
	}

	@Override
	public String toString() {
		return "MyController [service=" + service + "]";
	}

}
