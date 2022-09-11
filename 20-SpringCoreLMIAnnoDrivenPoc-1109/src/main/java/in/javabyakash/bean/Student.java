package in.javabyakash.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {

	@Autowired
	private Address address;

	public Student() {
		super();
	}
	
	@Lookup
	public Address getMyAddress() {
		return null;
	}

	public Address getAddress() {
		this.address=getMyAddress();
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
