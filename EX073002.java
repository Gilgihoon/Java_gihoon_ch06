
public class EX073002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[8][9];
			for (int i=2; i<=9; i++) { // i�� ���� 2���� �����ؼ� 9���� 1�� ����
				for (int j=1; j<=9; j++) { //j�� ���� 1���� 9���� 1�� ����
					System.out.print(i+"*"+j+"="+i*j+"\t"); // i*j + \t (tab:���� ����)
				}
				System.out.println(); //�� ������ ���� 9���� ���� ��������
			}
	}
}