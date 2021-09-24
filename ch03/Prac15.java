package oos.practice.chap03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac15 {	//Multiply클래스 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			//예외처리 
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int n=in.nextInt();
				int m=in.nextInt();
				System.out.println(n + "*" + m + "=" + n*m);
				break;
				
			}catch(InputMismatchException err) {
				System.out.println("실수는 입력하면 안됩니다.");
				in.nextLine();	//Scanner에 이미 입력된 키를 모두 제거하기 위해 nextLine()호출
			}
		}
		in.close();
	}
}
