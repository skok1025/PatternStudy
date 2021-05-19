package prototype_pattern.deepshallow;

public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012, 3));
		
		// 얕은 복사 : 복사된 객체의 인스턴스 변수는 원본 객체의 인스턴스 변수와 같은 메모리 주소를 참조한다.
		// 깊은 복사 : 전부(해당 객체, 인스턴스 변수)를 복사하여 새 주소에 담기 때문에 참조를 공유하지 않는다.
		
		//Cat yo = navi; // 얕은 복사
		Cat yo = navi.copy(); // 깊은 복사
		yo.setName("yo");
		
		yo.getAge().setYear(2013); // 얕은 복사
		yo.getAge().setValue(2);
		
		//yo.setAge(new Age(2013, 2)); // 깊은복사
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
	}

}
