package in.javabyakash.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class EmailConfig {
	private String host;
	private Integer port;
	private Boolean active;
	private String usr;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	@Override
	public String toString() {
		return "EmailConfig [host=" + host + ", port=" + port + ", active=" + active + ", usr=" + usr + "]";
	}

}
