package oos.practice.chap02;
import java.util.Scanner;
public class Prac04 {
	
//	public static void main(String[] args)
//	{
//		Scanner in = new Scanner(System.in);
//		int[]arr=new int[3];
//		
//		System.out.print("���� 3�� �Է�>>");
//		for(int i=0;i<arr.length;i++)
//			arr[i]=in.nextInt();
//		
//		//�߰��� ã�� 
//		int median = 0;
//		if(arr[0]>arr[1])
//		{
//			if(arr[1]>arr[2]) 
//				median=arr[1];
//			else //arr[2]>=arr[1]	
//			{
//				if(arr[0]>arr[2])
//					median=arr[2];
//				else
//					median=arr[0];
//			}
//		}
//		else	//arr[1]>=arr[0]
//		{
//			if(arr[2]>arr[1])	
//				median=arr[1];
//			else	//arr[1]>=arr[2]	
//			{
//				if(arr[0]>arr[2])	
//					median=arr[0];
//				else	//arr[2]>=arr[0]	
//					median=arr[2];
//			}
//		}
//		
//		System.out.println("�߰� ���� "+median);
//		in.close();
//	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("���� 3�� �Է�>>");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		
		//�߰��� ã�� => Point: ex) a<=b<=c or c<=b<=a �����غ��� 
		//a�� �߰����� ���
		if((b>a && a>c) || (c>a && a>b))
			System.out.println("�߰� ���� "+a);		
		//b�� �߰����� ���
		else if((a>b && b>c) || (c>b && b>a))
			System.out.println("�߰� ���� "+b);	
		//c�� �߰����� ���
		else if((a>c && c>b) || (b>c && c>a))
			System.out.println("�߰� ���� "+c);	
		
		in.close();
	}
}
