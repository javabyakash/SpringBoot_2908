package in.javabyakash.bean;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class PetrolEngineImpl implements IEngine {
	private Integer code;

	public PetrolEngineImpl() {
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
		return "PetrolEngineImpl [code=" + code + "]";
	}

}
