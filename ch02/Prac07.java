package oos.practice.chap02;
import java.util.Scanner;
public class Prac07 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int x,y;
		
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		x=in.nextInt();
		y=in.nextInt();
		
		if((x>=100&&x<=200)&&(y>=100&&y<=200))	//����
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
		else //����
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� �����ϴ�.");
		
		in.close();
	}
}
