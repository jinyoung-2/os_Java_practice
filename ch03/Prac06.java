package oos.practice.chap03;

import java.util.Scanner;

public class Prac06 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int[] unit= {50000,10000,1000,500,100,50,10,1};	//ȯ���� ���� ����
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money=in.nextInt();	//�ݾ�
		
		for(int i=0;i<unit.length;i++) {
			System.out.println(unit[i]+"�� ¥�� : "+money/unit[i]+"��");
			money=money%unit[i];
		}	
	}
}
