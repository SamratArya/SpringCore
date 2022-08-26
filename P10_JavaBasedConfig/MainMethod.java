package P10_JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMethod {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Ex1_Student st1 = (Ex1_Student) context.getBean("student");
//		st1.details();
		
//		System.out.println("------------------------------------");
//		Ex2_Employee e1 = (Ex2_Employee) context.getBean("getEmp");
//		e1.print();
		
		System.out.println("------------------------------------");
		Ex3_Vehicle e3 = (Ex3_Vehicle) context.getBean("getDetail");
		e3.checkDetail();
	}

}
