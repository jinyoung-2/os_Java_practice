package oos.practice.chap02;
import java.util.Scanner;
public class Prac09 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double centerX=in.nextDouble();
		double centerY=in.nextDouble();
		double radius=in.nextDouble();
		
		System.out.print("�� �Է�>>");
		double x=in.nextDouble();
		double y=in.nextDouble();
		
		//�˰���
		//(x,y)�� �� �ȿ� �ִ��� check! 
		//�־��� ���� ���� �߽��� �Ÿ� ���� ��, �� �Ÿ��� �� ���������� ū�� check
		double tempX=x-centerX;
		double tempY=y-centerY;
		double result=Math.sqrt(tempX*tempX+tempY*tempY);
		
		if(result>radius)
			System.out.println("�� ("+x+", "+y+")�� �� �ȿ� ����.");
		else
			System.out.println("�� ("+x+", "+y+")�� �� �ȿ� �ִ�.");

		in.close();
	}
}
