package oos.practice.chap02;
import java.util.Scanner;
public class Prac06 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num=in.nextInt();
		
		int a=num%10;
		int b=num/10;
		int count=0;
		
		if(a==3||a==6||a==9)
			count++;
		if(b==3||b==6||b==9)
			count++;
		
		//������ 3,6,9 �� �ϳ��� �ִ� ���
		if(count==1)
			System.out.println("�ڼ�¦");
		
		//������ 3,6,9 �� �� �� �ִ� ��� 
		if(count==2)	
			System.out.println("�ڼ�¦¦");
		
		in.close();
	}
}
