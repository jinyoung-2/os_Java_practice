package oos.practice.chap03;

import java.util.Scanner;

public class Prac05 {
	public static void main(String[] args) {
		System.out.print("양의 정수 10개를 입력하세요>>");
		Scanner in=new Scanner(System.in);
		int[] n=new int[10];
		for(int i=0;i<10;i++)
			n[i]=in.nextInt();
		
		//3의 배수인지 검사
		System.out.print("3의 배수는");
		for(int i=0;i<10;i++) {
			if(n[i]%3==0)
				System.out.print(" "+n[i]);
		}
	}
}
