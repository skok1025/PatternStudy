package factory_pattern;

public class ikea {
	
	public static void main(String[] args) {
		
		IkeaFactory ikeaFactory = new IkeaFactory();
		ikeaFactory.order("chair").design();
		ikeaFactory.order("chair").make();
		
		ikeaFactory.order("desk").design();
		ikeaFactory.order("desk").make();
		
	}

}
