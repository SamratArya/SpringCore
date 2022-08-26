package P6_Autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Ex2_UsingAnnotations1 {
	
	//Here we are using annotation at property
	@Autowired
	Ex2_UsingAnnotations2 address;

	public Ex2_UsingAnnotations2 getAddress() {
		return address;
	}

	public void setAddress(Ex2_UsingAnnotations2 address) {
		System.out.println("Setting address");
		this.address = address;
	}

	public Ex2_UsingAnnotations1(Ex2_UsingAnnotations2 address) {
		super();
		this.address = address;
	}

	public Ex2_UsingAnnotations1() {
		super();
		System.out.println("THis is normal constructor");
	}

	@Override
	public String toString() {
		return "Ex2_UsingAnnotations1 [address=" + address + "]";
	}
	
	

}
