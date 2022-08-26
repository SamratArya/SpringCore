package P5_LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex1_UsingXMLTest {
	
	public static void main(String[] args) {
		
		//For normal initialize method
		//ApplicationContext context = new ClassPathXmlApplicationContext("/P5_LifeCycle/appsConfig.xml");
		
		//For calling destroy method we have use to AbstractApplicationContext
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/P5_LifeCycle/appsConfig.xml");
		Ex1_UsingXML e1 = (Ex1_UsingXML) context.getBean("a1");
		System.out.println(e1);
		//here we are calling destroy method
		context.registerShutdownHook();
	}

}
