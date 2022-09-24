package in.javabyakash.dbcon;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "app.database")
public class DatabaseConnection {
	private String driver;
	private String url;
	private String user;
	private String password;
}
