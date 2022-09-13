package in.javabyakash;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("process")
public class Process {
	// @Value("#{2+3}")
	// @Value("#{'AkashHiwale'.length()}")
	// @Value("#{new java.util.Random().nextInt()}")
	// @Value("#{T(java.lang.Math).abs(new java.util.Random().nextInt())}")
	// @Value("#{'akash'.length() > 5 ? 100 : 50}")
	// @Value("#{model.code.length()}")
	//@Value("#{model.code.toLowerCase()}")
	@Value("#{model.code.replace('T','K')}")
	private String code;
	
	// @Value("#{new java.util.Random().nextInt() < 5 ? true : false}")
	// @Value("#{new java.util.Random().nextInt() > 5}")
	// @Value("#{new java.util.Random().nextInt() ge 5}")
	// @Value("#{5 % 2 > 0 && 2 + 3 gt 5}")
	@Value("#{5 % 2 > 0 and 2 + 3 gt 5}")
	private Boolean isPresent;

	// SpEL to convert String literal to char[]
	@Value("#{model.code.toCharArray()}")
	private char[] data;

	// SpEL to convert String to Byte
	@Value("#{model.code.getBytes()}")
	private Byte[] arr;

	// SpEL to convert Anytype to Stream
	@Value("#{model.code.lines()}")
	private Stream<String> stream;

	public Process() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getIsPresent() {
		return isPresent;
	}

	public void setIsPresent(Boolean isPresent) {
		this.isPresent = isPresent;
	}

	public char[] getData() {
		return data;
	}

	public void setData(char[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Process [code=" + code + ", isPresent=" + isPresent + ", data=" + Arrays.toString(data) + ", arr="
				+ Arrays.toString(arr) + ", stream=" + stream + "]";
	}

}
