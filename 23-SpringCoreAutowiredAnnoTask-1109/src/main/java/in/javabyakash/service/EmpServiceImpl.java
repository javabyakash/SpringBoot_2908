package in.javabyakash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.javabyakash.dao.IEmpDao;

@Component
public class EmpServiceImpl implements IEmpService {

	@Autowired
	private IEmpDao empDao;

	@Override
	public void empServiceMsg() {
		System.out.println("FROM EMPSERVICEIMPL CLASS");
		empDao.empDaoMsg();
	}

	public EmpServiceImpl() {
		super();
	}

	@Override
	public String toString() {
		return "EmpServiceImpl [empDao=" + empDao + "]";
	}

}
