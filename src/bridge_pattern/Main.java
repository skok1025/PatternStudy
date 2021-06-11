package bridge_pattern;

public class Main {

	public static void main(String[] args) {
		
		PrintMorseCode code = new PrintMorseCode(new DefaultMorseCodeFunction());
		//PrintMorseCode code = new PrintMorseCode(new SoundMorseCodeFunction());
		//code.g(); code.a();
		code.g().a();
	}
}
