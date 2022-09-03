package in.akash;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("user")
public class User {
	
	@Value("Akash")
	private String name;
	@Value("7774949414")
	private Long mobile;

	@Override
	public String toString() {
		return "User [name=" + name + ", mobile=" + mobile + "]";
	}

}
