package P9_ExpressionLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vari")
public class Ex3_UsingVariables {
	
	@Value("#{ T(java.lang.Math).PI }")
	double e;

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Ex3_UsingVariables [e=" + e + "]";
	}
	
	
}
