package __strategy_pattern;

public class GameCharacter {
	private Weapon weapon;
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		if (weapon == null) {
			System.out.println("�Ǽհ���");
		} else {
			weapon.attack();
		}
	}
	
	public static void main(String[] args) {
		GameCharacter character = new GameCharacter();
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Gun());
		character.attack();
		
	}

}
