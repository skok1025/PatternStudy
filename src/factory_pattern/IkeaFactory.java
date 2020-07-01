package factory_pattern;

public class IkeaFactory {
	
	// Furniture
	//  -- 하위 클래스
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
