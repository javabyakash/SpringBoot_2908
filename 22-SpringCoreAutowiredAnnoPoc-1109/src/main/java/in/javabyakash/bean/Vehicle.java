package in.javabyakash.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	@Autowired
	@Qualifier("petrolEngineImpl")
	private IEngine engine;

	public Vehicle() {
		super();
	}

	public IEngine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + "]";
	}

}
