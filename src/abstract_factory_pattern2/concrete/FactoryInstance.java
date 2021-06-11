package abstract_factory_pattern2.concrete;

import abstract_factory_pattern2.abst.Button;
import abstract_factory_pattern2.abst.GuiFac;
import abstract_factory_pattern2.abst.TextArea;

public class FactoryInstance {

	public static GuiFac getGuiFac() {
		switch (getOsCode()) {
			case 0: return new WindowGuiFac();
			case 1: return new LinuxGuiFac();
			default: break;
		}
		return null;
	}
	
	private static int getOsCode() {
		if (System.getProperty("os.name").equals("Windows 10")) {
			return 0;
		}
		return 1;
	}
}

class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("������ ��ư Ŭ��");
	}

}

class LinuxGuiFac implements GuiFac{

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}

}

class LinuxTextArea implements TextArea{

	@Override
	public String getText() {
		return "������ �ؽ�Ʈ";
	}

}

class WindowButton implements Button{

	@Override
	public void click() {
		System.out.println("������ ��ư Ŭ��");
	}

}

class WindowGuiFac implements GuiFac{

	@Override
	public Button createButton() {
		return new WindowButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WIndowTextArea();
	}

}

class WIndowTextArea implements TextArea{

	@Override
	public String getText() {
		return "������ �ؽ�Ʈ";
	}

}

