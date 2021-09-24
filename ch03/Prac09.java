package oos.practice.chap03;

public class Prac09 {
	public static void main(String[] args) {
		int[] num[]=new int[4][4];
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) 
				num[i][j]=(int)(Math.random()*10)+1;
		}
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) 
				System.out.printf("%-4d",num[i][j]);
			System.out.println();
		}
	}
}
