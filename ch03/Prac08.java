package oos.practice.chap03;

import java.util.Scanner;

public class Prac08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt;
		
		System.out.print("���� �?");
		cnt=in.nextInt();	//���� ����
		if(cnt>=100)
			in.close();		//Q. �����ΰ�??? �� �ڵ��? 
		
		//1~100���� ������ ���� �����ϰ� ����
		int[] num=new int[cnt];
		for(int i=0;i<num.length;i++) {
			//�迭���� ���� ���� ������ ��
			num[i]=(int)(Math.random()*100)+1;
			for(int j=0;j<i;j++) {
				if(num[j]==num[i]) {
					i--;
					break;
				}		
			}
		}

		//�迭 ���
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
