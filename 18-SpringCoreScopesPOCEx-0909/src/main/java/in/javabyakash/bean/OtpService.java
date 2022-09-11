package in.javabyakash.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class OtpService {

	@Autowired
	private Otp otp;

	public OtpService() {
		super();
	}

	public Otp getOtp() {
		this.otp=getMyOtp();
		return otp;
	}

	public void setOtp(Otp otp) {
		this.otp = otp;
	}

	@Lookup
	public Otp getMyOtp() {
		return null;
	}
	
	@Override
	public String toString() {
		return "OtpService [otp=" + otp + "]";
	}

}
