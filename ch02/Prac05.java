package oos.practice.chap02;
import java.util.Scanner;
public class Prac05 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		
		if(a+b>c || b+c>a || c+a>b)
			System.out.println("�ﰢ���� �˴ϴ�.");
		else
			System.out.println("�ﰢ���� �� �˴ϴ�.");
	}
}
