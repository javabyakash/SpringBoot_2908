package in.javabyakash.bean;

import java.util.Random;

public class Token {

	private Integer code;

	public Token() {
		super();
		this.code = Math.abs(new Random().nextInt(10));
		System.out.println("CONSTRUCTOR CALLED! WITH VALUE : "+code);
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
