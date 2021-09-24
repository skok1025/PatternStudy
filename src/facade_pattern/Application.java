package facade_pattern;

import facade_pattern.system.Facade;

public class Application {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.process();
	}
}
