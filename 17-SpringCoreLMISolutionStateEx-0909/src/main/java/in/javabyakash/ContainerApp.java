package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.bean.Token;
import in.javabyakash.bean.TokenService;
import in.javabyakash.config.AppConfig;

public class ContainerApp {
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//reading 1st object from container
		TokenService ts1 = ac.getBean("tokenService",TokenService.class);
		Token tok1 = ts1.getToken();
		System.out.println(ts1.hashCode()+" -=-=-=-=-=- "+tok1.hashCode());
		
		//reading 2nd object from container
		TokenService ts2 = ac.getBean("tokenService", TokenService.class);
		Token tok2 = ts2.getToken();
		System.out.println(ts2.hashCode()+" -=-=-=-=-=- "+tok2.hashCode());
		
		//reading 3rd object from container
		TokenService ts3 = ac.getBean("tokenService",TokenService.class);
		Token tok3 = ts3.getToken();
		System.out.println(ts3.hashCode()+" -=-=-=-=-=- "+tok3.hashCode());
	}
}
