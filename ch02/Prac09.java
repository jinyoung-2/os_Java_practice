package oos.practice.chap02;
import java.util.Scanner;
public class Prac09 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		double centerX=in.nextDouble();
		double centerY=in.nextDouble();
		double radius=in.nextDouble();
		
		System.out.print("점 입력>>");
		double x=in.nextDouble();
		double y=in.nextDouble();
		
		//알고리즘
		//(x,y)가 원 안에 있는지 check! 
		//주어진 점과 원의 중심의 거리 구한 후, 그 거리가 원 반지름보다 큰지 check
		double tempX=x-centerX;
		double tempY=y-centerY;
		double result=Math.sqrt(tempX*tempX+tempY*tempY);
		
		if(result>radius)
			System.out.println("점 ("+x+", "+y+")는 원 안에 없다.");
		else
			System.out.println("점 ("+x+", "+y+")는 원 안에 있다.");

		in.close();
	}
}
