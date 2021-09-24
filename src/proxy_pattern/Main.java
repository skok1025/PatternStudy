package proxy_pattern;

public class Main {
	
	public static void main(String[] args) {
		Subject real = new RealSubject();
		Subject proxy = new Proxy(real);
		
		proxy.action1();
		proxy.action2();
	}

}
