package decorator_pattern.concrete;

import decorator_pattern.IBeverage;

/**
 * 
 * @author admin
 *
 */
public class Base implements IBeverage {

	@Override
	public int getTotalPrice() {
		return 0;
	}

}
