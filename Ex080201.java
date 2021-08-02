import java.util.Scanner;

public class Ex080201 {

	public static void main(String[] args) {
		boolean run = true;
		int stuNum = 0;
		int[]scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("------------------------------------");
			System.out.println("���� > ");

			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л��� > ");
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
				System.out.println ("�ְ����� : " + max);
				System.out.println ("������� : " + avg);
			}else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}