package in.javabyakash.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tok")
public class Token {
	@Value("123")
	private Integer code;

	public Token() {
		super();
		System.out.println("CONSTRUCTOR CALLED! "+"WITH HASHCODE : "+this.hashCode());
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
