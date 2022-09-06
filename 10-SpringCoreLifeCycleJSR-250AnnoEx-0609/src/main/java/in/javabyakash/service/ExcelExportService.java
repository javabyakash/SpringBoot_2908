package in.javabyakash.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelExportService {
	@Value("Report")
	private String fileName;
	@Value("Download")
	private String mode;

	public ExcelExportService() {
		super();
		System.out.println("FROM CONSTRUCTOR");
	}
	
	//setup method
	@PostConstruct
	public void setup() {
		//some code
		System.out.println("FROM INIT METHOD");
	}
	//destroy method
	@PreDestroy
	public void destroy() {
		//some code
		System.out.println("FROM DESTROY METHOD");
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		System.out.println("FROM SETTER METHOD");
		this.fileName = fileName;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "ExcelExportService [fileName=" + fileName + ", mode=" + mode + "]";
	}

}
