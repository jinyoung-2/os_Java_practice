package oos.practice.chap02;
import java.util.Scanner;
public class Prac10 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		double centerX1=in.nextDouble();
		double centerY1=in.nextDouble();
		double radius1=in.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		double centerX2=in.nextDouble();
		double centerY2=in.nextDouble();
		double radius2=in.nextDouble();
		
		//알고리즘 -> 두 원이 서로 겹치는지 판단 
		//두 원의 중심사이의 거리와 두 원의 반지름의 합과 비교
		double tempx=centerX1-centerX2;
		double tempy=centerY1-centerY2;
		double tempr=radius1+radius2;
		
		double result=Math.sqrt(tempx*tempx+tempy*tempy);
		if(result>tempr)
			System.out.print("두 원은 서로 겹치지 않는다.");
		else
			System.out.println("두 원은 서로 겹친다.");		
		in.close();
	}
}
