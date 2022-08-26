package P2_CollectionTypes;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex1_Employees {
	
	String empName;
	List<String> phones;
	Set<String> address;
	
	
	
	public Ex1_Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ex1_Employees(String empName, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	Map<String, String> courses;
	
	@Override
	public String toString() {
		return "Ex1_Employees [empName=" + empName + ", phones=" + phones + ", address=" + address + ", courses=" + courses + "]";
	}


}
