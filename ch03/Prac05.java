package oos.practice.chap03;

import java.util.Scanner;

public class Prac05 {
	public static void main(String[] args) {
		System.out.print("���� ���� 10���� �Է��ϼ���>>");
		Scanner in=new Scanner(System.in);
		int[] n=new int[10];
		for(int i=0;i<10;i++)
			n[i]=in.nextInt();
		
		//3�� ������� �˻�
		System.out.print("3�� �����");
		for(int i=0;i<10;i++) {
			if(n[i]%3==0)
				System.out.print(" "+n[i]);
		}
	}
}
