package in.javabyakash.repo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("repo")
public class DataSourceRepo {
	@Value("jdbc:oracle:thin:@localhost:1521:orcl")
	private String url;
	@Value("scott")
	private String username;
	@Value("tiger")
	private String password;
	@Value("oracle.jdbc.driver.OracleDriver")
	private String driver;

	public DataSourceRepo() {
		super();
	}

	@Override
	public String toString() {
		return "DataSourceRepo [url=" + url + ", username=" + username + ", password=" + password + ", driver=" + driver
				+ "]";
	}

}
