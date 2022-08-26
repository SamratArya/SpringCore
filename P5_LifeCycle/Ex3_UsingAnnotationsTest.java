package P5_LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex3_UsingAnnotationsTest {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/P5_LifeCycle/appsConfig.xml");
		Ex3_UsingAnnotations a3 = (Ex3_UsingAnnotations) context.getBean("a3");
		System.out.println(a3);
		context.registerShutdownHook();
	}

}
