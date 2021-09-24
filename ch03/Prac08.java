package oos.practice.chap03;

import java.util.Scanner;

public class Prac08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt;
		
		System.out.print("정수 몇개?");
		cnt=in.nextInt();	//정수 개수
		if(cnt>=100)
			in.close();		//Q. 종료인가??? 이 코드는? 
		
		//1~100까지 범위의 정수 랜덤하게 삽입
		int[] num=new int[cnt];
		for(int i=0;i<num.length;i++) {
			//배열에는 같은 수가 없도록 함
			num[i]=(int)(Math.random()*100)+1;
			for(int j=0;j<i;j++) {
				if(num[j]==num[i]) {
					i--;
					break;
				}		
			}
		}

		//배열 출력
		for(int i=0;i<num.length;i++) {
			if((i+1)%10==0) {
				System.out.print(num[i]);
				System.out.println();
			}
			else
				System.out.printf("%-4d",num[i]);
		}	
	}
}
