package in.javabyakash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.javabyakash.service.IEmpService;

@Component
public class EmpController {

	@Autowired
	private IEmpService empService;

	public void getServiceMsg() {
		System.out.println("FROM EMPCONTROLLER CLASS");
		empService.empServiceMsg();
	}

	public EmpController() {
		super();
	}

	@Override
	public String toString() {
		return "EmpController [empService=" + empService + "]";
	}

}
