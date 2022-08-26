package P6_Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		
		
		//by using xml
		ApplicationContext context = new ClassPathXmlApplicationContext("/P6_Autowiring/apptconfig.xml");
		Ex1_UsingXML1 e1 = (Ex1_UsingXML1) context.getBean("employee");
		System.out.println(e1);
		
		//by using annotations
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/P6_Autowiring/apptconfig.xml");
//		Ex2_UsingAnnotations1 e1 = (Ex2_UsingAnnotations1) context.getBean("main");
//		System.out.println(e1);
	}

}
