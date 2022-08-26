package P10_JavaBasedConfig;

import org.springframework.beans.factory.annotation.Value;

public class Ex3_VehicleType {
	
	@Value("#{ 'Toyota' }")
	String brand;
	@Value("#{ 'Dark Maroon' }")
	String color;
	@Value("#{ 'SUV' }")
	String type;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void checkType()
	{
		System.out.println("Brand : "+brand+" Color : "+color+" Type : "+type);
	}

}
