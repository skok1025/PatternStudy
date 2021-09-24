package proxy_pattern;

public interface Subject {
	
	// 리소스가 적게 드는 일
	void action1();
	
	// 리소스가 많이 드는 일, network, memory
	void action2();

}
