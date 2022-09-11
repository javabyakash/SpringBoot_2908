package in.javabyakash.dao;

import org.springframework.stereotype.Component;

@Component
public class EmpDaoImpl implements IEmpDao {

	@Override
	public void empDaoMsg() {
		System.out.println("FROM EMPDAOIMPL CLASS");
	}

}
