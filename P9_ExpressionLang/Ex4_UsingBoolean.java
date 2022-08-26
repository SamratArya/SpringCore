package P9_ExpressionLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bool")
public class Ex4_UsingBoolean {
	
	@Value("#{ (14*5) > (12*12) }")
	boolean result;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Ex4_UsingBoolean [result=" + result + "]";
	}
	
	
	

}
