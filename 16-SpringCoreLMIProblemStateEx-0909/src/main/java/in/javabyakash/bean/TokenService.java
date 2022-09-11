package in.javabyakash.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TokenService {
	
	@Autowired
	private Token token;

	public TokenService() {
		super();
		System.out.println("TOKEN - SERVICE CONSTRUCTOR CALLED!");
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}

}
