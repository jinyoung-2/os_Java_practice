package oos.practice.chap02;
import java.util.Scanner;
public class Prac01 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int money=in.nextInt();
		double exchangeMoney=(double)money/1100;
		
		System.out.println(money+"원은 $"+exchangeMoney+"입니다.");
		
		in.close();
	}
}
