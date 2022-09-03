package in.javabyakash.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vr")
public class ViewResolver {
	@Value("pages")
	private String prefix;
	@Value(".jps")
	private String suffix;

	@Override
	public String toString() {
		return "ViewResolver [prefix=" + prefix + ", suffix=" + suffix + "]";
	}

}
