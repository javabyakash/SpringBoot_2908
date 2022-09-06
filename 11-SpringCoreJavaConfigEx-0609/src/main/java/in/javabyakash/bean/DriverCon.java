package in.javabyakash.bean;

public class DriverCon {
	private String driver;
	private String url;

	public DriverCon() {
		super();
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "DriverCon [driver=" + driver + ", url=" + url + "]";
	}

}
