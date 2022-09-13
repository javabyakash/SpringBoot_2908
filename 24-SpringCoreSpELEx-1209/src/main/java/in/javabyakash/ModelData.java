package in.javabyakash;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("model")
public class ModelData {
	@Value("TEST")
	private String code;

	public ModelData() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "ModelData [code=" + code + "]";
	}

}
