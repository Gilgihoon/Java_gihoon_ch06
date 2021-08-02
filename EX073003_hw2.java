
public class EX073003_hw2 {
	
public static void main(String[] args) {
	int [][] array = new int [5][5];
		for(int i =0;i<array[i].length;i++) {
			int=1;
			if(i%2==0) {
				array[i][j]=(i+1)+(j*5);
			
			} else {
				array[i][j] = 5*(j+1)-i;
			}
		}	
		for(int i =0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
			System.out.printf(array[i][j] + "\t");
				}
			System.out.println();
		}
	}
}