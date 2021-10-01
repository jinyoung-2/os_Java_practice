//package oos.practice.chap03;
//
//import java.util.Scanner;
//
//public class Prac16_02 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String[] str= {"����","����","��"};
//		int winner=0;
//
//		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
//
//		while(true) {
//			//����� ����
//			System.out.print("���� ���� ��!>>");
//			String user=in.nextLine();
//
//			//��������
//			if(user.equals("�׸�")) {
//				System.out.println("������ �����մϴ�...");
//				break;
//			}
//			//EnterŰ �Է½�, �ڵ����� ��ǻ�� ����
//			int randIndex=(int)(Math.random()*3);
//			String computer=str[randIndex];
//
//			switch(user) {
//			case "����":
//				if(computer.equals("����"))
//					winner=1;
//				else if(computer.equals("����"))
//					winner=2;
//				else
//					winner=3;
//				 break;
//			case "����":
//				if (computer.equals("����"))
//					winner=3;
//				else if (computer.equals("����"))
//					winner=1;
//				else
//					winner=2;
//				break;
//			case "��":
//				if (computer.equals("����"))
//					winner=2;
//				else if (computer.equals("����"))
//					winner=3;
//				else
//					winner=1;
//				break;
//			}
//
//			if (winner==1)
//				System.out.println("����� = "+user+" , ��ǻ�� = "+computer+", �����ϴ�.");
//			else if (winner==2)
//				System.out.println("����� = "+user+" , ��ǻ�� = "+computer+", ��ǻ�Ͱ� �̰���ϴ�.");
//			else
//				System.out.println("����� = "+user+" , ��ǻ�� = "+computer+", ����ڰ� �̰���ϴ�.");
//		}
//	}
//}
