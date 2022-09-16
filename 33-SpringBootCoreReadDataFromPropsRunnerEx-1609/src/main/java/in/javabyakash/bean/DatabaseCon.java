package in.javabyakash.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseCon {
	@Value("${my.app.driver}")
	private String driver;
	@Value("${my.app.url}")
	private String url;
	@Value("${my.app.username}")
	private String username;
	@Value("${my.app.password}")
	private String password;

	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ "]";
	}

}
