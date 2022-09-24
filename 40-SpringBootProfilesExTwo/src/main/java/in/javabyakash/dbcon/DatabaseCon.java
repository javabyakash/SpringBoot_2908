package in.javabyakash.dbcon;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.app")
public class DatabaseCon {

	private String driver;
	private String url;
	private String username;
	private String password;

}
