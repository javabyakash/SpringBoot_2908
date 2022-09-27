package in.javabyakash.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Employee {
	@Value("101")
	private Integer empId;
	@Value("Akash")
	private String empName;
	@Value("300.0")
	private Double sal;
}
