package oos.practice.chap02;
import java.util.Scanner;
public class Prac01 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int money=in.nextInt();
		double exchangeMoney=(double)money/1100;
		
		System.out.println(money+"���� $"+exchangeMoney+"�Դϴ�.");
		
		in.close();
	}
}
