package oos.practice.chap03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac15 {	//MultiplyŬ���� 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			//����ó�� 
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				int n=in.nextInt();
				int m=in.nextInt();
				System.out.println(n + "*" + m + "=" + n*m);
				break;
				
			}catch(InputMismatchException err) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				in.nextLine();	//Scanner�� �̹� �Էµ� Ű�� ��� �����ϱ� ���� nextLine()ȣ��
			}
		}
		in.close();
	}
}
