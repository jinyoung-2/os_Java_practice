package oos.practice.chap02;
import java.util.Scanner;
public class Prac10 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		double centerX1=in.nextDouble();
		double centerY1=in.nextDouble();
		double radius1=in.nextDouble();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		double centerX2=in.nextDouble();
		double centerY2=in.nextDouble();
		double radius2=in.nextDouble();
		
		//�˰��� -> �� ���� ���� ��ġ���� �Ǵ� 
		//�� ���� �߽ɻ����� �Ÿ��� �� ���� �������� �հ� ��
		double tempx=centerX1-centerX2;
		double tempy=centerY1-centerY2;
		double tempr=radius1+radius2;
		
		double result=Math.sqrt(tempx*tempx+tempy*tempy);
		if(result>tempr)
			System.out.print("�� ���� ���� ��ġ�� �ʴ´�.");
		else
			System.out.println("�� ���� ���� ��ģ��.");		
		in.close();
	}
}
