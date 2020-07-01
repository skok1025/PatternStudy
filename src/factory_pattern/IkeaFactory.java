package factory_pattern;

public class IkeaFactory {
	
	// Furniture
	//  -- ���� Ŭ����
	//        ChairMaker
	//        DeskMaker
	public Furniture order(String what) {
		
		switch (what) {
		case "desk":
			return new DeskMaker();
		case "chair":
			return new ChairMaker();
		}
		
		return null;
	}

}
