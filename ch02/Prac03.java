package oos.practice.chap02;
import java.util.Scanner;
public class Prac03 {
//	public static void main(String[] args)
//	{
//		Scanner in = new Scanner(System.in);
//		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
//		int money=in.nextInt();
//		
//		//Point: ��� �̿�
//		final int WON_50000 = 50000;
//		final int WON_10000 = 10000;
//		final int WON_1000 = 1000;
//		final int WON_100 = 100;
//		final int WON_50 = 50;
//		final int WON_10 = 10;
//		final int WON_1 = 1;
//		
//		if(money>WON_50000) {
//			System.out.println("�������� "+money/50000+"��");
//			money%=50000;	//���ǻ���: -�� �ϸ� �� ��
//		}
//		if(money>WON_10000) {
//			System.out.println("������ "+money/WON_10000+"��");
//			money%=WON_10000;
//		}
//		if(money>WON_1000) {
//			System.out.println("õ���� "+money/WON_1000+"��");
//			money%=WON_1000;
//		}
//		if(money>WON_100) {
//			System.out.println("��� "+money/WON_100+"��");
//			money%=WON_100;
//		}
//		if(money>WON_50) {
//			System.out.println("���ʿ� "+money/WON_50+"��");
//			money%=WON_50;
//		}
//		if(money>WON_10) {
//			System.out.println("�ʿ� "+money/WON_10+"��");
//			money%=WON_10;
//		}
//		if(money>WON_1) {
//			System.out.println("�Ͽ� "+money/WON_1+"��");
//		}		
//		
//		in.close();
//	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] won= {50000,10000,1000,500,100,50,10,1};
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money=in.nextInt();
		
		for(int i=0;i<won.length;i++) {
			System.out.println(won[i]+"�� "+money/won[i]+"��");
			money%=won[i];
		}	
		
		in.close();
	}
}
