package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.javabyakash.bean.Token;

public class ContainerApp {
	public static void main(String[] args) {
		System.out.println("Before Container Creation");
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("After Container Created");
		Token token = ac.getBean("t1",Token.class);
		System.out.println(token.hashCode());
		
		Token token2 = ac.getBean("t1",Token.class);
		System.out.println(token2.hashCode());
	}
}	
