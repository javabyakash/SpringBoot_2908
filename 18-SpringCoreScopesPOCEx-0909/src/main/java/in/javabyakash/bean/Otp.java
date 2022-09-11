package in.javabyakash.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Otp {
	private Integer opt;

	public Otp() {
		super();
	}

	public Integer getOpt() {
		return opt;
	}

	public void setOpt(Integer opt) {
		this.opt = opt;
	}

	@Override
	public String toString() {
		return "Otp [opt=" + opt + "]";
	}

}
