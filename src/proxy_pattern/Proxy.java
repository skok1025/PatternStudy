package proxy_pattern;

public class Proxy implements Subject{

	private Subject real;
	
	public Proxy(Subject real) {
		this.real = real;
	}
	
	@Override
	public void action1() {
		System.out.println("������ ���� by ���Ͻ�");
	}

	@Override
	public void action2() {
		this.real.action2();
	}

}