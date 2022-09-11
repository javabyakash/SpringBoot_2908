package in.javabyakash.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	@Autowired
	private Address address;

	public Employee() {
		super();
	}

	public Address getMyAddrs() {
		return null;
	}

	public Address getAddress() {
		this.address = getMyAddrs();
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
