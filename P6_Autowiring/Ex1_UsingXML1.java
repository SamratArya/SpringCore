package P6_Autowiring;

public class Ex1_UsingXML1 {
	
	String empName;
	Ex1_UsingXML2 address;	
	
	public Ex1_UsingXML1() {
		super();
		System.out.println("This is a normal constructor");
	}
	
	public Ex1_UsingXML1(String empName, Ex1_UsingXML2 address) {
		super();
		this.empName = empName;
		this.address = address;
		System.out.println("This is a paramterized constructor");
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		System.out.println("Setting name");
		this.empName = empName;
	}
	public Ex1_UsingXML2 getAddress() {
		return address;
	}

	public void setAddress(Ex1_UsingXML2 address) {
		System.out.println("Setting address");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Ex1_UsingXML1 [empName=" + empName + ", address=" + address + "]";
	}
	
	
	

}
