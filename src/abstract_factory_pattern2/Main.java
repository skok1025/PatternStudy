package abstract_factory_pattern2;

import abstract_factory_pattern2.abst.Button;
import abstract_factory_pattern2.abst.GuiFac;
import abstract_factory_pattern2.abst.TextArea;
import abstract_factory_pattern2.concrete.FactoryInstance;

public class Main {
	
	public static void main(String[] args) {
		
		GuiFac factory = FactoryInstance.getGuiFac();
		
		Button button = factory.createButton();
		TextArea textArea = factory.createTextArea();
		
		button.click();
		System.out.println(textArea.getText());
		
	}

}
