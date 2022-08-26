package P4_ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex2_Map1Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/P4_ConstructorInjection/applicateConf.xml");
		Ex2_Map1 m1 = (Ex2_Map1) context.getBean("m1");
		m1.checkAnswer();
	}

}
