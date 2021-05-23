package template_method_pattern;

import template_method_pattern.lib.AbstGameConnectHelper;
import template_method_pattern.lib.DefaultGameConnectionHelper;

public class Main {
	
	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectionHelper();
		helper.requestConnection("아이디 암호 접속정보");
	}

}
