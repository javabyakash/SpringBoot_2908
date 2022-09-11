package in.javabyakash.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Developer {

	@Autowired
	private Address addrs;

	public Developer() {
		super();
		System.out.println("Developer : 0-Param Constructor");
	}
	
	@Lookup
	public Address getMyAddress() {
		return null;
	}

	public Address getAddrs() {
		this.addrs = getMyAddress();
		return addrs;
	}

	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Developer [addrs=" + addrs + "]";
	}

}
