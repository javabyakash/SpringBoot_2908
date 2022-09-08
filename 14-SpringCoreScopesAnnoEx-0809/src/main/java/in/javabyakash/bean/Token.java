package in.javabyakash.bean;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("token")
@Scope("prototype")
public class Token {

	private Integer code;

	public Token() {
		super();
		this.code = Math.abs(new Random().nextInt(999));
		System.out.println("CONSTRUCTOR CALLED!");
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
		System.out.println("SETTER METHOD CALLED!");
	}

	@Override
	public String toString() {
		return "Token [code=" + code + "]";
	}

}
