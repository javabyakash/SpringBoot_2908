package in.javabyakash.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = {"default","qa"})
public class EmployeeMySqlDaoImpl implements IEmployeeDao {

	@Override
	public void showDbConfig() {
		System.out.println("FROM MYSQL DAO IMPL!");
	}

}
