package in.akash.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.akash.bean.OracleCon;

public class FirstAppTest {
	public static void main(String[] args) {
		//create IOC Container
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		//get object from container
		Object bean = (OracleCon)ac.getBean("con");
		System.out.println(bean.toString());
	}

}
