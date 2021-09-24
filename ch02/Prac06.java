package oos.practice.chap02;
import java.util.Scanner;
public class Prac06 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num=in.nextInt();
		
		int a=num%10;
		int b=num/10;
		int count=0;
		
		if(a==3||a==6||a==9)
			count++;
		if(b==3||b==6||b==9)
			count++;
		
		//정수에 3,6,9 중 하나가 있는 경우
		if(count==1)
			System.out.println("박수짝");
		
		//정수에 3,6,9 중 두 개 있는 경우 
		if(count==2)	
			System.out.println("박수짝짝");
		
		in.close();
	}
}
