package factory_mathod_pattern.concrete;

import java.util.Date;

import factory_mathod_pattern.framework.Item;
import factory_mathod_pattern.framework.ItemCreator;

public class HpPotionCreator extends ItemCreator{

	@Override
	protected void requestItemsInfo() {
		System.out.println("�����ͺ��̽����� ü�� ������ ������ �����ɴϴ�.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("ü�� ������ ���� �����߽��ϴ�." + new Date());
	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}

}
