package P10_JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "P10_JavaBasedConfig")
public class JavaConfig {
	
//	@Bean
//	public Ex2_EmployeeAddress getAdd()
//	{
//		return new Ex2_EmployeeAddress();
//	}
//	
//	@Bean
//	public Ex2_Employee getEmp()
//	{
//		Ex2_Employee e1 = new Ex2_Employee(getAdd());
//		return e1;
//	}
	
	@Bean
	public Ex3_VehicleType getType()
	{
		return new Ex3_VehicleType();
	}
	
	@Bean
	public Ex3_Vehicle getDetail()
	{
		Ex3_Vehicle e1 = new Ex3_Vehicle(getType());
		return e1;
	}
	

}
	