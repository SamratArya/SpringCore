package P9_ExpressionLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("check")
public class Ex1_checkExpress {
	
	@Value("#{ 55+11 }")
	int x;
	@Value("#{ 45+13 }")
	int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Ex1_checkExpress [x=" + x + ", y=" + y + "]";
	}
	
	

}
