
public class EX073002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[8][9];
			for (int i=2; i<=9; i++) { // i의 값을 2부터 시작해서 9까지 1씩 증가
				for (int j=1; j<=9; j++) { //j의 값을 1부터 9까지 1씩 증가
					System.out.print(i+"*"+j+"="+i*j+"\t"); // i*j + \t (tab:띄어쓰기 역할)
				}
				System.out.println(); //위 지정된 값인 9이후 부터 내려쓰기
			}
	}
}