package P5_LifeCycle;

public class Ex1_UsingXML {
	
	String name;
	String address;

	public Ex1_UsingXML() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting name : ");
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("Setting address : ");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Ex1_UsingXML [name=" + name + ", address=" + address + "]";
	}
	
	public void init()
	{
		System.out.println("This is init method");
	}
	
	public void destroy()
	{
		System.out.println("THis is destroy method");
	}

}
