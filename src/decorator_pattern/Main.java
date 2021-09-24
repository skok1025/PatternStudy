package decorator_pattern;

import java.util.Scanner;

import decorator_pattern.concrete.Base;
import decorator_pattern.concrete.Espresso;
import decorator_pattern.concrete.Milk;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		IBeverage beverage = new Base();
		boolean done = false;
		
		while (!done) {
			System.out.println("음료 현재 가격 : " + beverage.getTotalPrice());
			System.out.println("선택 : 1. 샷추가 / 2. 우유추가");
			
			switch (scan.nextInt()) {
				case 0: done = true;
				break;
				case 1: 
					beverage = new Espresso(beverage);
				break;
				case 2: 
					beverage = new Milk(beverage);
				break;
			}
		}
	}

}
