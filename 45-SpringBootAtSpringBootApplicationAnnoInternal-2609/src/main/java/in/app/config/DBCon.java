package in.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class DBCon {
	@Value("oracle.jdbc")
	private String driver;
	@Value("jdbc:oracle")
	private String url;
	@Value("scott")
	private String username;
	@Value("tiger")
	private String password;
}
