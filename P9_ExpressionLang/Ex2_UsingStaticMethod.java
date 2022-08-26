package P9_ExpressionLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("square")
public class Ex2_UsingStaticMethod {
	
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	double a;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Ex2_UsingStaticMethod [a=" + a + "]";
	}
	
	

}
