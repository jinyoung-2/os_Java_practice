package oos.practice.chap02;
import java.util.Scanner;
public class Prac12 {
//	public static void main(String[] args)
//	{
//		Scanner in = new Scanner(System.in);
//		
//		//�Է�
//		System.out.print("����>>");
//		float num1=Float.parseFloat(in.next());
//		char cal=in.next().charAt(0);
//		float num2=Float.parseFloat(in.next());
//		float result=0f;
//		
//		//�˰���
//		if(cal=='+')
//			result=num1+num2;
//		else if(cal=='-')
//			result=num1-num2;
//		else if(cal=='*')
//			result=num1*num2;
//		else if(cal=='/')
//		{
//			if(num2==0) {
//				System.out.println("0���� ���� �� �����ϴ�.");
//				return ;
//			}
//			result=num1/num2;
//		}
//		System.out.println(num1+cal+num2+"�� ��� ����� "+ result);	
//		//Q. char���� �̿��� ��, num1+cal+num2�� �ϸ� ���� �̻��ϰ� �����
//		//A. char������ cal���� �ƽ�Ű�ڵ� ��ȣ�� ���� �ȴ� => ���ڵ��� ���������� �Ǿ� ���� �߻� 
//		// => ���ڿ��� �Է¹޴� �� ��õ
//	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//�Է�
		System.out.print("����>>");
		double n1=in.nextDouble();
		String s=in.next();
		double n2=in.nextDouble();
		double result=0;
		boolean isRight=true;
		
		//Case 1. if-else��
//		if(s.equals("+"))
//			result=n1+n2;
//		else if(s.equals("-"))
//			result=n1-n2;
//		else if(s.equals("*"))
//			result=n1*n2;
//		else if(s.equals("/")) {
//			if(n2==0) 
//				isRight=false;
//			else
//				result=n1/n2;
//		}
//		if(!isRight)
//			System.out.println("0���� ���� �� �����ϴ�.");
//		else
//			System.out.println(n1+s+n2+"�� ��� ����� "+result);
//		
//		in.close();
		
		
		//Case 2. switch��
		//Q. �ڷ����� ���ڿ��ε�, switch�� ����� �� �ִ°ǰ�? 
		//A. switch���� ���ǽĿ� ���ڿ� ��� + case���� ���� ���ڿ� ��� ��� 
		switch(s)
		{
			case "+":			
				result=n1+n2;
				break;
			case "-":
				result=n1-n2;
				break;
			case "*":
				result=n1*n2;
				break;
			case "/":
				isRight=false;
				break;
		}
		if(isRight==false)
		{
			if(n2==0){
				System.out.println("0���� ���� �� �����ϴ�.");
				in.close();	//Q. return ;��� ����� �� �ִ°ǰ�?
			}
			else
				result=n1/n2;
		}
		System.out.println(n1+s+n2+"�� ��� ����� "+result);
		in.close();
	}
}
