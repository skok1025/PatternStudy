package decorator_pattern;

public abstract class AbstAdding implements IBeverage {
	private IBeverage base;
	
	public AbstAdding(IBeverage base) {
		super();
		this.base = base;
	}
	
	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}
	
	protected IBeverage getBase() {
		return base;
	}

}
