package template_method_pattern.lib;

public class DefaultGameConnectionHelper extends AbstGameConnectHelper{

	@Override
	protected String doSecurity(String string) {
		System.out.println("���ڵ�");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("���̵� ��ȣ Ȯ�ΰ���");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("���� Ȯ��");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("������ ���Ӵܰ�!");
		return info;
	}

}
