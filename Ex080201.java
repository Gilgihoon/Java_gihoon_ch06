import java.util.Scanner;

public class Ex080201 {

	public static void main(String[] args) {
		boolean run = true;
		int stuNum = 0;
		int[]scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------------------");
			System.out.println("선택 > ");

			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수 > ");
				stuNum = scanner.nextInt();
				scores = new int[stuNum];
			} else if(selectNo == 2) {
				for(int i=0; i<stuNum; i++) {
					System.out.print("scores[" + i + "] : ");
					int score = scanner.nextInt();
					scores[i] = score;	
				}
			} else if(selectNo == 3) {
				for(int i=0; i<stuNum; i++) {
					System.out.print("scores[" + i + "] : " + scores[i]);
				}
			} else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				for (int i = 0; i < stuNum; i++) {
					sum += scores[i];
					if (scores[i]>max) {
						max = scores[i];
					}
				}
				avg = (double) sum/stuNum;
				System.out.println ("최고점수 : " + max);
				System.out.println ("평균점수 : " + avg);
			}else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}