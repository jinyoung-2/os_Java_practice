package oos.practice.chap03;

import java.util.Scanner;

public class Prac03 {
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요>>");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		
		for(int i=num;i>0;i--) {
			for(int j=i;j>0;j--) 
				System.out.print("*");
			System.out.println();
		}
	}
}
