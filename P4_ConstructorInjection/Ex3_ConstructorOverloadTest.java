package P4_ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex3_ConstructorOverloadTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/P4_ConstructorInjection/applicateConf.xml");
		Ex3_ConstructorOverload e3 = (Ex3_ConstructorOverload) context.getBean("c1");
		e3.checkSum();
	}

}
