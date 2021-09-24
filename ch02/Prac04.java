package oos.practice.chap02;
import java.util.Scanner;
public class Prac04 {
	
//	public static void main(String[] args)
//	{
//		Scanner in = new Scanner(System.in);
//		int[]arr=new int[3];
//		
//		System.out.print("정수 3개 입력>>");
//		for(int i=0;i<arr.length;i++)
//			arr[i]=in.nextInt();
//		
//		//중간값 찾기 
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
//		System.out.println("중간 값은 "+median);
//		in.close();
//	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("정수 3개 입력>>");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		
		//중간값 찾기 => Point: ex) a<=b<=c or c<=b<=a 생각해보기 
		//a가 중간값인 경우
		if((b>a && a>c) || (c>a && a>b))
			System.out.println("중간 값은 "+a);		
		//b가 중간값인 경우
		else if((a>b && b>c) || (c>b && b>a))
			System.out.println("중간 값은 "+b);	
		//c가 중간값인 경우
		else if((a>c && c>b) || (b>c && c>a))
			System.out.println("중간 값은 "+c);	
		
		in.close();
	}
}
