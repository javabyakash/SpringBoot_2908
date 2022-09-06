package in.javabyakash.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExcelExportService implements InitializingBean, DisposableBean {
	private String fileName;
	private String mode;

	public void afterPropertiesSet() throws Exception {
		// some code
		System.out.println("FROM AFTER-PROPERTIES-SET METHOD");
	}

	public void destroy() throws Exception {
		// some code
		System.out.println("FROM DESTROY METHOD");

	}

	public ExcelExportService() {
		super();
		System.out.println("FROM CONSTRUCTOR");
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
