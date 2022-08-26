package P5_LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Ex2_UsingInterfaces implements InitializingBean , DisposableBean{
	
	String name;
	int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting name :: ");
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		System.out.println("Setting price :: ");
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Ex2_UsingInterfaces [name=" + name + ", price=" + price + "]";
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("It is a initial method");
	}
	public void destroy() throws Exception {
		System.out.println("It is a destroy method");
	}
	

	

}
