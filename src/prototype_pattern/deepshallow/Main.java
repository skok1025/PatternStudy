package prototype_pattern.deepshallow;

public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012, 3));
		
		// ���� ���� : ����� ��ü�� �ν��Ͻ� ������ ���� ��ü�� �ν��Ͻ� ������ ���� �޸� �ּҸ� �����Ѵ�.
		// ���� ���� : ����(�ش� ��ü, �ν��Ͻ� ����)�� �����Ͽ� �� �ּҿ� ��� ������ ������ �������� �ʴ´�.
		
		//Cat yo = navi; // ���� ����
		Cat yo = navi.copy(); // ���� ����
		yo.setName("yo");
		
		yo.getAge().setYear(2013); // ���� ����
		yo.getAge().setValue(2);
		
		//yo.setAge(new Age(2013, 2)); // ��������
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
	}

}
