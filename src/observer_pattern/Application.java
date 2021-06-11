package observer_pattern;

import observer_pattern.Button.OnClickListner;

public class Application {
	
	public static void main(String[] args) {
		Button button = new Button();
		//button.setOnClickListner(new ButtonClick());
		button.setOnClickListner(new OnClickListner() {
			@Override
			public void onClick(Button button) {
				System.out.println(button + "is Clicked");
			}
		});
		button.onClick();
	}

}

class ButtonClick implements OnClickListner {

	@Override
	public void onClick(Button button) {
		System.out.println(button + "is Clicked");
	}
	
}
