package factory_mathod_pattern.concrete;

import factory_mathod_pattern.framework.Item;
import factory_mathod_pattern.framework.ItemCreator;

public class Main {
	
	public static void main(String[] args) {
		ItemCreator creator;
		Item item, item2;
		
		creator = new HpPotionCreator();
		item = creator.create();
		item.use();
		
		creator = new MpPotionCreator();
		item2 = creator.create();
		item2.use();
		
	}

}
