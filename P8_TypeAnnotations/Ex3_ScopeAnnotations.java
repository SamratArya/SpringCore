package P8_TypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("checkHash")
//@Scope("prototype")
public class Ex3_ScopeAnnotations {
	
	@Value("Amit Vishwakarma")
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ex3_ScopeAnnotations [name=" + name + "]";
	}
	
	

}
