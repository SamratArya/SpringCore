package P6_Autowiring;

public class Ex2_UsingAnnotations2 {
	
	String state;
	String city;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		System.out.println("setting state");
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("setting city");
		this.city = city;
	}
	public Ex2_UsingAnnotations2(String state, String city) {
		super();
		this.state = state;
		this.city = city;
	}
	public Ex2_UsingAnnotations2() {
		super();
		
	}
	@Override
	public String toString() {
		return "Ex2_UsingAnnotations2 [state=" + state + ", city=" + city + "]";
	}
	
	

}
