package oos.practice.chap03;

import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) {
	
		char alph;
		Scanner in = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		alph=in.next().charAt(0);	
		
		//Q. ���� �ϳ� �Է¹��� �� �ַ� ��� �ۼ��ϴ°� ������?
		//A. Scanner�� ���� �Է¹޴� ��� ���� => ���ڿ��� �Է¹��� ��, ���ڷ� ��ȯ������� �� 
		//�ַ�, in.next().charAt() ������ �����ϰ� ���
		
		for(int i=alph;i>='a';i--) {		//line �ݺ�Ƚ��
			for(char j='a';j<=i;j++) 		//�� line�� ����� ���ĺ� ����
				System.out.print(j);
			System.out.println();
		}
		
//		for(int i=alph;i>='a';i--) {		//line �ݺ�Ƚ��
//			for(int j='a';j<=i;j++) 		//�� line�� ����� ���ĺ� ����
//				System.out.print((char)j);
//			System.out.println();
//		}
	}
}
