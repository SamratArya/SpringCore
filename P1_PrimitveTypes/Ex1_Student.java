package P1_PrimitveTypes;

public class Ex1_Student {
	
	int studentID;
	String studentName;
	String studentAddress;
	
	public Ex1_Student(int studentID, String studentName, String studentAddress) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public Ex1_Student() {
		super();
		
	}

	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		System.out.println("setting student id");
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("setting student name");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("setting student address");
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Ex1_Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
	}
	
	
	

}
