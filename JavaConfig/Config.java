package JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import JavaConfig.Car;
import JavaConfig.Bike;

@Configuration
@ComponentScan("JavaConfig")

public class Config {

	@Bean 
	public Vehicle Obj1() {
		return new Car();
	}
	
	@Bean 
	public Vehicle Obj2() {
		return new Bike();
	}
	
}