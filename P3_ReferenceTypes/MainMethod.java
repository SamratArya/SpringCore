package P3_ReferenceTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/P3_ReferenceTypes/appConfig.xml");
		Ex1_Employee e1 = (Ex1_Employee) context.getBean("add2");
		System.out.println("Employee ID : "+e1.getEmpID());
		System.out.println("Employee Name : "+e1.getEmpName());
		System.out.println("State : "+e1.getAddress().getState());
		System.out.println("City : "+e1.getAddress().getCity());
		System.out.println("Street : "+e1.getAddress().getStreet());
		System.out.println("Pincode : "+e1.getAddress().getPincode());
		
		
		System.out.println("-----------------------------");
		Ex2_PrimeNumberSingle p1 = (Ex2_PrimeNumberSingle) context.getBean("single");
		p1.checkPrime();
	}

}
