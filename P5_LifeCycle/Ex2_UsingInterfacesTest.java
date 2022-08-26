package P5_LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex2_UsingInterfacesTest {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/P5_LifeCycle/appsConfig.xml");
		Ex2_UsingInterfaces e1 = (Ex2_UsingInterfaces) context.getBean("a2");
		System.out.println(e1);
		//for destroy
		context.registerShutdownHook();
	}

}
