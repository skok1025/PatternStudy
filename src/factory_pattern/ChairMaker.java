package factory_pattern;

public class ChairMaker implements Furniture{

	@Override
	public void make() {
		System.out.println("Chair Make...");
	}

	@Override
	public void design() {
		System.out.println("Chair Design...");
	}

}
