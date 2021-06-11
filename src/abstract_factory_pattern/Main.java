package abstract_factory_pattern;

import abstract_factory_pattern.Sam.SamFactory;
import abstract_factory_pattern.abst.BikeFactory;
import abstract_factory_pattern.abst.Body;
import abstract_factory_pattern.abst.Wheel;

public class Main {
	
	public static void main(String[] args) {

		BikeFactory factory = new SamFactory();
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}

}
