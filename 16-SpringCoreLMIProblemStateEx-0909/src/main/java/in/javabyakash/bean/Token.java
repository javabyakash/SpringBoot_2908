package in.javabyakash.bean;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Token {
	private Integer code;

	public Token() {
		super();
		this.code = Math.abs(new Random().nextInt());
		System.out.println("TOKEN - CONTUCTOR IS CALLED WITH VALUE : "+code);
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Token [code=" + code + "]";
	}

}
