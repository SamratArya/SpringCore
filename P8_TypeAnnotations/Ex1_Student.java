package P8_TypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//while passing parameters in component it will manually create a object of it
@Component("student")
public class Ex1_Student {
	
	//Value annotation is used to set the value of the variables at runtime
	@Value("Amit Vishwakarma")
	String fullname;
	@Value("Mumbai")
	String address;
	@Value("45")
	int rollno;
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Ex1_Student [fullname=" + fullname + ", address=" + address + ", rollno=" + rollno + "]";
	}
	
	

}
