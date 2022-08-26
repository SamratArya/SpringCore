package P8_TypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/P8_TypeAnnotations/appsConfig.xml");
		Ex1_Student e1 = (Ex1_Student) context.getBean("student");
		System.out.println(e1);
		
		System.out.println("------------------------------------");
		Ex2_Employe_Value v1 = (Ex2_Employe_Value) context.getBean("employee");
		System.out.println("Employee Name : "+v1.getEmpName());
		System.out.println("Employee Address : "+v1.getAddress());
		System.out.println("Type of List : "+v1.getAddress().getClass().getName());
		
		
		System.out.println("----------------------------");
		Ex3_ScopeAnnotations s1 = (Ex3_ScopeAnnotations) context.getBean("checkHash");
		System.out.println(s1.getName());
		Ex3_ScopeAnnotations s2 = (Ex3_ScopeAnnotations) context.getBean("checkHash");
		System.out.println("Hash 1 : "+s1.hashCode());
		System.out.println("Hash 2 : "+s2.hashCode());
		
	}

}
