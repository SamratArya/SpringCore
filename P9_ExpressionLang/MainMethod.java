package P9_ExpressionLang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/P9_ExpressionLang/appconFig.xml");
		Ex1_checkExpress c1 = (Ex1_checkExpress) context.getBean("check");
		System.out.println(c1);
		
		System.out.println("-------------------------------------------");
		Ex2_UsingStaticMethod a1 = (Ex2_UsingStaticMethod) context.getBean("square");
		System.out.println("Sqaure root of : "+a1);
		
		System.out.println("--------------------------------------------");
		Ex3_UsingVariables a2 = (Ex3_UsingVariables) context.getBean("vari");
		System.out.println(a2);
		
		System.out.println("--------------------------------------------");
		Ex4_UsingBoolean e2 = (Ex4_UsingBoolean) context.getBean("bool");
		System.out.println(e2);
	}

}
