package oos.practice.chap02;
import java.util.Scanner;
public class Prac02 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int num=in.nextInt();
		
		//�߰��ϸ� ���� ����ó�� => 10~99 ������ �������� 
		if(num<10||num>99) {
			System.out.println("�Էµ� ������ ���ǿ� �ش����� �ʽ��ϴ�.");
			in.close();		//Q. return ; ��� �ۼ��ص� �ǳ�?
		}
		
		if(num%10==num/10)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		in.close();
	}
}
