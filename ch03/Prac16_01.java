package oos.practice.chap03;

import java.util.Scanner;

public class Prac16_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String user;
		String computer;
		String[] str= {"����","����","��"};
		int randIndex;
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			//����� ����
			System.out.print("���� ���� ��!>>");
			user=in.nextLine();
			
			//�������� 
			if(user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;	//Q. in.close()�� �ϸ� �� �Ǵ� ������? �ۼ��� ���ѹݺ��� �Ǵ� ������?
			}
			//EnterŰ �Է½�, �ڵ����� ��ǻ�� ����
			randIndex=(int)(Math.random()*3);
			computer=str[randIndex];
			
			System.out.print("����� = "+user+", ��ǻ�� = "+computer);
			//��� ���
			if(user.equals(computer)) 
				System.out.println(", �����ϴ�.");
			//����ڰ� �̱� ���//����ڰ� �� ��� 
			if(user.equals("����")) {
				if(computer.equals("����")) //����ڰ� �̱� ���
					System.out.println(", ����ڰ� �̰���ϴ�.");
				else if(computer.equals("��")) //����ڰ� �� ���
					System.out.println(", ����ڰ� �����ϴ�.");
			}
			else if(user.equals("����")) {
				if(computer.equals("����")) //����ڰ� �̱� ���
					System.out.println(", ����ڰ� �̰���ϴ�.");
				else if(computer.equals("��")) //����ڰ� �� ���
					System.out.println(", ����ڰ� �����ϴ�.");
			}
			else if(user.equals("��")) {
				if(computer.equals("����")) //����ڰ� �̱� ���
					System.out.println(", ����ڰ� �̰���ϴ�.");
				else if(computer.equals("����")) //����ڰ� �� ���
					System.out.println(", ����ڰ� �����ϴ�.");
			}	
		}
	}
}
