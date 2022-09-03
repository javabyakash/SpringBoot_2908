package in.javabyakash;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.repo.DataSourceRepo;

public class ContainerClass {
	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		
		//find all classes from given base-package(package and it sub-package)
		ac.scan("in.javabyakash");
		
		//refresh spring container
		ac.refresh();
		
		//get spring bean
		DataSourceRepo bean = ac.getBean("repo",DataSourceRepo.class);
		
		//print object to see values are injected through @Value 
		System.out.println(bean);
	}
}
