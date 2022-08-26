package P5_LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ex3_UsingAnnotations {
	
	String name;
	String address;
	
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
		return "Ex3_UsingAnnotations [name=" + name + ", address=" + address + "]";
	}
	
	@PostConstruct    //to initialize
	public void start()
	{
		System.out.println("This is a start method");
	}
	
	@PreDestroy    //to destroy
	public void end()
	{
		System.out.println("This is a end method");
	}

}
