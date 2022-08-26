package P2_CollectionTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/P2_CollectionTypes/applicationConfig.xml");
		Ex1_Employees e1 = (Ex1_Employees) context.getBean("employee1");
		System.out.println("Employee Name : "+e1.getEmpName());
		System.out.println("Employee Phone_no : "+e1.getPhones());
		System.out.println("Employee Address : "+e1.getAddress());
		System.out.println("Employee Courses : "+e1.getCourses());
		
	}

}
