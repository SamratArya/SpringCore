package P8_TypeAnnotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Ex2_Employe_Value {
	@Value("Amit Vishwakarma")
	String empName;
	@Value("#{myList}")
	List<String> address;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Ex2_Employe_Value [empName=" + empName + ", address=" + address + "]";
	}
	
	

}
