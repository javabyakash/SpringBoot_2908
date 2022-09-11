package in.javabyakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.javabyakash.bean.Otp;
import in.javabyakash.bean.OtpService;
import in.javabyakash.config.AppConfig;

public class ContainerApp {
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//reading 1st time object from container
		OtpService os1 = ac.getBean("otpService",OtpService.class);
		Otp otp1 = os1.getOtp();
		System.out.println(os1.hashCode()+"-=-=-=-"+otp1.hashCode());
		
		//reading 2nd time object from container
		OtpService os2 = ac.getBean("otpService",OtpService.class);
		Otp otp2 = os2.getOtp();
		System.out.println(os2.hashCode()+"-=-=-=-"+otp2.hashCode());
	}
}
