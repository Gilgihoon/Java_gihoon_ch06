
public class EX073003_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[5][5];// 5행5열
		int num = 1;
		for (int i = 0; i < array.length; i++) {//배열 arr의 행의 길이만큼 반복문이 수행된다 
			for (int j = 0; j < array[0].length; j++) {//배열array[0]의 열의 길이만큼 반복문이 수행된다 
				array[i][j] = num;//arr[i][j]에 num을 대입한다 
				System.out.print(array[i][j]+ "\t");//배열 array에 들어있는 숫자를 출력한다 
				num++;//1씩 증가
				} 
				System.out.println();//줄을 바꾼다 } } }
			}
	}
}

		