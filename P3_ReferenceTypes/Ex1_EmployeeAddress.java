package P3_ReferenceTypes;

public class Ex1_EmployeeAddress {
	
	String state;
	String city;
	String street;
	String pincode;
	

	public Ex1_EmployeeAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ex1_EmployeeAddress(String state, String city, String street, String pincode) {
		super();
		this.state = state;
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}
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

	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Ex1_EmployeeAddress [state=" + state + ", city=" + city + ", street=" + street + ", pincode=" + pincode + "]";
	}
	

}
