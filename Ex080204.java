
public class Ex080204 {

	public static void main(String[] args) {
		Ms ms = new Ms();
		boolean result = ms.login("hong", "12345");
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			ms.logout("hong");
		}else {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			
		}
	}

}
