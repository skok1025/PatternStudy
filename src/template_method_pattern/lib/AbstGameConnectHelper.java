package template_method_pattern.lib;

public abstract class AbstGameConnectHelper {

	protected abstract String doSecurity(String string);

	protected abstract boolean authentication(String id, String password);

	protected abstract int authorization(String userName);

	protected abstract String connection(String info);

	// 탬플릿 메소드
	public String requestConnection(String encodedInfo) {
		// 1단계 : 보안과정 -> 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(encodedInfo);

		String id = "aaa";
		String pw = "bbb";

		if (!authentication(id, pw)) {
			throw new Error("아이디 암호 불일치");
		}

		String userName = "userName";
		int i = authorization(userName);

		switch (i) {
			case 0: // 게임 매니져
				break;
			case 1: // 유료 회원
				break;
			case 2: // 무료 회원
				break;
			case 3: // 권한없음
				break;
			default: // 기타상황
				break;
		}

		return connection(decodedInfo);
	}

}
