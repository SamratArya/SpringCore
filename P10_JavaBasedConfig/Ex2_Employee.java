package P10_JavaBasedConfig;

import org.springframework.beans.factory.annotation.Value;

public class Ex2_Employee {
	
	@Value("#{'Amit'}")
	String name;
	@Value("#{'11001'}")
	int id;
	Ex2_EmployeeAddress address;
	
	public Ex2_Employee(Ex2_EmployeeAddress add) {
		this.address=add;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Ex2_EmployeeAddress getAddress() {
		return address;
	}
	public void setAddress(Ex2_EmployeeAddress address) {
		this.address = address;
	}
	
	void print()
	{
		address.display();
		System.out.println("Name : "+name+" ID : "+id);
	}
	
	
	
}
