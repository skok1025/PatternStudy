package factory_mathod_pattern.framework;

public abstract class ItemCreator {
	
	// template 메소드 패턴
	public Item create() {
		Item item;
		
		requestItemsInfo();
		item = createItem();
		createItemLog();
		
		return item;
	}
	
	//아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청합니다.
	abstract protected void requestItemsInfo();
	
	//아이템 생성 후, 아이템 복제 등의 블법을 방지하기 위해 데이터베이스에 아이템 생성기록을 저장합니다.
	abstract protected void createItemLog();
	
	// 아이템을 생성하는 알고리즘
	abstract protected Item createItem();
}
