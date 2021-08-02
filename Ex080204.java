
public class Ex080204 {

	public static void main(String[] args) {
		Ms ms = new Ms();
		boolean result = ms.login("hong", "12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
			ms.logout("hong");
		}else {
			System.out.println("로그아웃 되었습니다.");
			
		}
	}

}
