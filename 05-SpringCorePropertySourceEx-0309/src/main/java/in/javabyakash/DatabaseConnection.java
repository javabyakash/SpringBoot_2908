package in.javabyakash;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbcon")
public class DatabaseConnection {
	@Value("${my.db.driver}")
	private String driver;
	@Value("${my.db.url}")
	private String url;
	@Value("${my.db.username}")
	private String username;
	@Value("${my.db.password}")
	private String password;

	public DatabaseConnection() {
		super();
	}

	@Override
	public String toString() {
		return "DatabaseConnection [driver=" + driver + ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}

}
