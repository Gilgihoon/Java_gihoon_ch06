
public class Printer {
	static void println(int a) { //static 삽입으로, 해당 명령은 여기서만 쓰는것으로 세팅 (정적 필드, 메소드)
		System.out.println(a);
	}
	void println(boolean a) {
		System.out.println(a);
	}
	void println(double a) {
		System.out.println(a);
	}
	void println(String a) {
		System.out.println(a);
	}
}
// Printer Class 에 println()메소드를 삽입.