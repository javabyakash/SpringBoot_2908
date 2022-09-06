package in.javabyakash.service;

public class ExcelExportService {
	private String fileName;
	private String mode;

	public ExcelExportService() {
		super();
		System.out.println("FROM CONSTRUCTOR");
	}
	
	public void setup() {
		//some code
		System.out.println("FROM INIT METHOD");
	}
	
	public void clean() {
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
