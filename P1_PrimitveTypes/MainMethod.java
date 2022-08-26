package P1_PrimitveTypes;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class MainMethod 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello EveryOne...!!" );
        
        //Using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("/P1_PrimitveTypes/config.xml");
        Ex1_Student s1 = (Ex1_Student)context.getBean("Student1");
        System.out.println(s1);
        
        Ex1_Student s2 = (Ex1_Student)context.getBean("Student2");
        System.out.println(s2);
        
        System.out.println("-----------------------------------");
        Ex2_SumOfTwoNumbers sum = (Ex2_SumOfTwoNumbers) context.getBean("sum");
        sum.checkSum();
        
        System.out.println("-----------------------------------");
        Ex3_ArmstrongNumber a1 = (Ex3_ArmstrongNumber) context.getBean("arm");
        a1.check();

    }


	
}
	