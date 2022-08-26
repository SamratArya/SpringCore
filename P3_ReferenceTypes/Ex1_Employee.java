package P3_ReferenceTypes;

public class Ex1_Employee {
	
	int empID;
	String empName;
	Ex1_EmployeeAddress address;
	
	
	public Ex1_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ex1_Employee(int empID, String empName, Ex1_EmployeeAddress address) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.address = address;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Ex1_EmployeeAddress getAddress() {
		return address;
	}
	public void setAddress(Ex1_EmployeeAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Ex1_Employee [empID=" + empID + ", empName=" + empName + ", address=" + address + "]";
	}
	
	
	

}
