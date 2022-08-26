package P4_ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex1_VehicleTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/P4_ConstructorInjection/applicateConf.xml");
		Ex1_Vehicle e1 = (Ex1_Vehicle) context.getBean("v1");
//		System.out.println(e1);
		System.out.println("Vehicle Color : "+e1.color);
		System.out.println("Vehicle brand : "+e1.brand);
	}

}
