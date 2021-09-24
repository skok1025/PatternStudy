package decorator_pattern.concrete;

import decorator_pattern.AbstAdding;
import decorator_pattern.IBeverage;

public class Milk extends AbstAdding{

	public Milk(IBeverage meterial) {
		super(meterial);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + 50;
	}

}
