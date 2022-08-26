package P10_JavaBasedConfig;

import org.springframework.beans.factory.annotation.Value;

public class Ex2_EmployeeAddress {
	
	@Value("#{'Maharashtra'}")
	String state;
	@Value("#{'Mumbai'}")
	String city;
	@Value("#{'Kurla_west'}")
	String street;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void display()
	{
		System.out.println("State : "+state+" City : "+city+" Street : "+street);
	}
	

}
