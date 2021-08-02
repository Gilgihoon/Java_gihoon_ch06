
public class EX073003_hw1 {

public static void main(String[] args) {
	int [][] array = new int [5][5];
		int num = 1;
		for (int i=0; i<array.length; i++) {
			if(i%2==0) {
				for (int j=0; j<array.length; j++) {
					
					array[i][j]=num;
					num++;
				}
				} else { 
					for(int j=4; j>=0; j--) {
						array[i][j] = num;
						num++;
					}
				}
			}
			for (int i = 0; i<array.length; i++) {
				for (int j=0; j<array.length; j++) {
						System.out.print(array[i][j]+"\t");
				}
				System.out.println();
		}
	}
}	