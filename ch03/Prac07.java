package oos.practice.chap03;

import java.util.Scanner;

public class Prac07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] randNum=new int[10];
		double avg=0.0;
		
		//랜덤하게 정수 생성
		System.out.print("랜덤한 정수들 :");
		for(int i=0;i<randNum.length;i++) {
			randNum[i]=(int)(Math.random()*10)+1; //0.0<=  <1.0
			System.out.print(" "+randNum[i]);
			avg+=randNum[i];
		}
		System.out.println();
		
		avg=avg/randNum.length;	
		System.out.print("평균은 "+avg);
	}

}
