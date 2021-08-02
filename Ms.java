
public class Ms {
	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345"))
			// 비교값은 항시 왼쪽에 둘것.
			return true;
		else
			return false;
	}
	void logout (String id) {
		System.out.println("로그아웃 되었습니다.");// 로그아웃 되면 명령 실행. (리턴x)
	}
}
