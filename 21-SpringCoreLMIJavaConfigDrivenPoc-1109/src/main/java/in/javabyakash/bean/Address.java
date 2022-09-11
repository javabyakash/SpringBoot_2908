package in.javabyakash.bean;

public class Address {

	private String city;
	private Integer pinCode;

	public Address() {
		super();
		System.out.println("Address : 0-Param Constructor");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}

}
