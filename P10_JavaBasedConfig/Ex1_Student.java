package P10_JavaBasedConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Ex1_Student {
	
	@Value("#{'Amit'}")
	String name;
	@Value("#{'Mumbai'}")
	String address;
	@Value("#{'25'}")
	int age;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void details()
	{
		System.out.println("Name  : "+name+" Age : "+age+" Address : "+address);
	}

}
