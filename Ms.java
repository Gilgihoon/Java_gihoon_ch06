
public class Ms {
	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345"))
			// �񱳰��� �׽� ���ʿ� �Ѱ�.
			return true;
		else
			return false;
	}
	void logout (String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");// �α׾ƿ� �Ǹ� ��� ����. (����x)
	}
}
