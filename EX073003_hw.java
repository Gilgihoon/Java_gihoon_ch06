
public class EX073003_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[5][5];// 5��5��
		int num = 1;
		for (int i = 0; i < array.length; i++) {//�迭 arr�� ���� ���̸�ŭ �ݺ����� ����ȴ� 
			for (int j = 0; j < array[0].length; j++) {//�迭array[0]�� ���� ���̸�ŭ �ݺ����� ����ȴ� 
				array[i][j] = num;//arr[i][j]�� num�� �����Ѵ� 
				System.out.print(array[i][j]+ "\t");//�迭 array�� ����ִ� ���ڸ� ����Ѵ� 
				num++;//1�� ����
				} 
				System.out.println();//���� �ٲ۴� } } }
			}
	}
}

		