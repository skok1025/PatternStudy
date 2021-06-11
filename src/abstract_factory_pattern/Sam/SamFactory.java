package abstract_factory_pattern.Sam;

import abstract_factory_pattern.abst.BikeFactory;
import abstract_factory_pattern.abst.Body;
import abstract_factory_pattern.abst.Wheel;

public class SamFactory implements BikeFactory{

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamWheel();
	}

}
