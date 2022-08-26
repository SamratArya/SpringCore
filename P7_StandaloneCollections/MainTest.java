package P7_StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/P7_StandaloneCollections/AppConfig.xml");
		Ex1_List l1 = (Ex1_List) context.getBean("list1");
		System.out.println(l1);
		System.out.println("Type of list : "+l1.getFriends().getClass().getName());
		
		System.out.println("------------------------------");
		Ex2_Map e2 = (Ex2_Map) context.getBean("map1");
		System.out.println(e2);
		System.out.println("Type of Map : "+e2.getCourses().getClass().getName());
		
		System.out.println("------------------------------");
		Ex3_Set e3 = (Ex3_Set) context.getBean("set1");
		System.out.println(e3);
		System.out.println("Type of Set : "+e3.getPincode().getClass().getName());
	}

}
