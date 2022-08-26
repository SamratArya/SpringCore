package P4_ConstructorInjection;

public class Ex1_Vehicle {
	
	String color;
	String brand;

	public Ex1_Vehicle() {
		super();
		
	}

	public Ex1_Vehicle(String color, String brand) {
		super();
		this.color = color;
		this.brand = brand;
	}

	@Override
	public String toString() {
		
		return "Ex1_Vehicle [color=" + color + ", brand=" + brand + "]";
	}
	
	

}
