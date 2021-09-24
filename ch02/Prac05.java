package oos.practice.chap02;
import java.util.Scanner;
public class Prac05 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("정수 3개를 입력하시오>>");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		
		if(a+b>c || b+c>a || c+a>b)
			System.out.println("삼각형이 됩니다.");
		else
			System.out.println("삼각형이 안 됩니다.");
	}
}
