package oos.practice.chap03;

import java.util.Scanner;

public class Prac00 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//������ ī���� �� ���ߴ� ����
		int cnt=0;
		int userAns;
		int comAns;
		char yn;
		
		//��ǻ�Ͱ� 0~99 �� �����ϰ� �� �� ����
		comAns=(int)(Math.random()*99);
		
		//����� ���� �Է�
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
		System.out.println("0~99");
		
		//��
		while(true) {	
			cnt++;
			System.out.print(cnt+">>");
			userAns=in.nextInt();
			
			//�Ǵ� 
			if(comAns==userAns) {
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
				yn=in.next().charAt(0);
				if(yn=='n')	//���ڿ� ��=>equals()���, ���� yn�� �����̹Ƿ� yn=='n'���
					break;
				else {
					System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
					System.out.println("0~99");
					cnt=0;
				}
			}
			else if(comAns>userAns) 
				System.out.println("�� ����");
			else	//comAns<userAns
				System.out.println("�� ����");
			
		}
		//����
	}
}
