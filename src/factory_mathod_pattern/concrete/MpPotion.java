package factory_mathod_pattern.concrete;

import factory_mathod_pattern.framework.Item;

public class MpPotion implements Item{

	@Override
	public void use() {
		System.out.println("마력 회복");
	}

}
