package in.javabyakash.bean;

import java.util.Random;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CngEngineImpl implements IEngine {

	private Integer code;

	public CngEngineImpl() {
		super();
		this.code = Math.abs(new Random().nextInt(9999));
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "CngEngineImpl [code=" + code + "]";
	}

}
