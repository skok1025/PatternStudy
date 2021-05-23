package template_method_pattern.lib;

public abstract class AbstGameConnectHelper {

	protected abstract String doSecurity(String string);

	protected abstract boolean authentication(String id, String password);

	protected abstract int authorization(String userName);

	protected abstract String connection(String info);

	// ���ø� �޼ҵ�
	public String requestConnection(String encodedInfo) {
		// 1�ܰ� : ���Ȱ��� -> ��ȣȭ �� ���ڿ��� ��ȣȭ
		String decodedInfo = doSecurity(encodedInfo);

		String id = "aaa";
		String pw = "bbb";

		if (!authentication(id, pw)) {
			throw new Error("���̵� ��ȣ ����ġ");
		}

		String userName = "userName";
		int i = authorization(userName);

		switch (i) {
			case 0: // ���� �Ŵ���
				break;
			case 1: // ���� ȸ��
				break;
			case 2: // ���� ȸ��
				break;
			case 3: // ���Ѿ���
				break;
			default: // ��Ÿ��Ȳ
				break;
		}

		return connection(decodedInfo);
	}

}
