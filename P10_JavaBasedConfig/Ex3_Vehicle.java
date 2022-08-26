package P10_JavaBasedConfig;

import org.springframework.beans.factory.annotation.Value;

public class Ex3_Vehicle {
	
	@Value("#{ 'Innova' }")
	String name;
	Ex3_VehicleType vehType;
	
	
	public Ex3_Vehicle(Ex3_VehicleType vehType) {
		super();
		this.vehType = vehType;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ex3_VehicleType getVehType() {
		return vehType;
	}
	public void setVehType(Ex3_VehicleType vehType) {
		this.vehType = vehType;
	}
	
	public void checkDetail()
	{
		this.vehType.checkType();
		System.out.println("Vehicle Name : "+name);
	}

}
