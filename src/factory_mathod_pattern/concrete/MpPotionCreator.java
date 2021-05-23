package factory_mathod_pattern.concrete;

import java.util.Date;

import factory_mathod_pattern.framework.Item;
import factory_mathod_pattern.framework.ItemCreator;

public class MpPotionCreator extends ItemCreator{

	@Override
	protected void requestItemsInfo() {
		System.out.println("데이터베이스에서 마력 물약의 정보를 가져옵니다.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("마력 물약을 새로 생성했습니다." + new Date());
	}

	@Override
	protected Item createItem() {
		return new MpPotion();
	}

}
