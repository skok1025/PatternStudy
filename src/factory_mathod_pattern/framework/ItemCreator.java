package factory_mathod_pattern.framework;

public abstract class ItemCreator {
	
	// template �޼ҵ� ����
	public Item create() {
		Item item;
		
		requestItemsInfo();
		item = createItem();
		createItemLog();
		
		return item;
	}
	
	//�������� �����ϱ� ���� �����ͺ��̽����� ������ ������ ��û�մϴ�.
	abstract protected void requestItemsInfo();
	
	//������ ���� ��, ������ ���� ���� ����� �����ϱ� ���� �����ͺ��̽��� ������ ��������� �����մϴ�.
	abstract protected void createItemLog();
	
	// �������� �����ϴ� �˰���
	abstract protected Item createItem();
}
