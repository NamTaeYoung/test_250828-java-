package test;

import java.util.Random;

public class ArrayList {
	public static void main(String[] args) {
		Random r = new Random();
		int[][]  array= new int[3][4];
		int sum=0;
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]=r.nextInt(10);
				array[i][j]=r.nextInt(10);
				int a = array[i][j];
				sum +=a;
				count++;
				System.out.print(array[i][j]+"\t");
				if(count %4 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("합은 "+sum);
	}
}
