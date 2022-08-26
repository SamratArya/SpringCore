package P6_Autowiring;

public class Ex1_UsingXML2 {
	
	String state;
	String city;
	
	public Ex1_UsingXML2() {
		super();
			
	}
	
	public Ex1_UsingXML2(String state, String city) {
		super();
		this.state = state;
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		System.out.println("Set state");
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("Set city");
		this.city = city;
	}

	@Override
	public String toString() {
		return "Ex1_UsingXML2 [state=" + state + ", city=" + city + "]";
	}
	
	

}
