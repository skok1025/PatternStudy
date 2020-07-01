package factory_pattern;

public class DeskMaker implements Furniture{

	@Override
	public void make() {
		System.out.println("Desk Making...");
	}

	@Override
	public void design() {
		System.out.println("Desk Design...");
	}

}
