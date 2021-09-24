package oos.practice.chap03;

import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) {
	
		char alph;
		Scanner in = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		alph=in.next().charAt(0);	
		
		//Q. 문자 하나 입력받을 땐 주로 어떻게 작성하는게 좋은가?
		//A. Scanner는 문자 입력받는 기능 없음 => 문자열을 입력받은 후, 문자로 변환시켜줘야 함 
		//주로, in.next().charAt() 형식을 유용하게 사용
		
		for(int i=alph;i>='a';i--) {		//line 반복횟수
			for(char j='a';j<=i;j++) 		//한 line당 출력할 알파벳 개수
				System.out.print(j);
			System.out.println();
		}
		
//		for(int i=alph;i>='a';i--) {		//line 반복횟수
//			for(int j='a';j<=i;j++) 		//한 line당 출력할 알파벳 개수
//				System.out.print((char)j);
//			System.out.println();
//		}
	}
}
