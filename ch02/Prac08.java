package oos.practice.chap02;
import java.util.Scanner;
public class Prac08 {
	
	public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2){ 
		if ((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
			return true; 
		else
			return false; 
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int x1,y1,x2,y2;
		
		System.out.print("점 (x1,y1)의 좌표를 입력하시오>>");
		x1=in.nextInt();
		y1=in.nextInt();
		
		System.out.print("점 (x2,y2)의 좌표를 입력하시오>>");
		x2=in.nextInt();
		y2=in.nextInt();
		
		//충돌되는지 판별
		
		//기존 사각형이 입력받은 사각형을 포함시키는 경우
		if (inRect(x1,y1,100,100,200,200) || 
				inRect(x2,y2,100,100,200,200) || 
				inRect(x1,y2,100,100,200,200) || 
				inRect(x2,y1,100,100,200,200)) 
			System.out.println("사각형이 겹칩니다."); 
		else if ((inRect(x1,y1,100,100,200,200)) &&
				inRect(x2,y2,100,100,200,200) && 
				inRect(x2,y1,100,100,200,200) && 
				inRect(x1,y2,100,100,200,200)) 
			System.out.println("사각형이 겹칩니다."); 
		//입력받은 사각형이 기존 사각형을 호함시키는 경우(입력받은 사각형이 더 큰 경우)
		else if ((inRect(100,100,x1,y1,x2,y2)) && 
				inRect(100,200,x1,y1,x2,y2) && 
				inRect(200,100,x1,y1,x2,y2) && 
				inRect(200,200,x1,y1,x2,y2)) 
			System.out.println("사각형이 겹칩니다.");
		else System.out.println("사각형이 겹치지 않습니다."); 
		
		in.close();
	}
	
//	public static void main(String[] args) { 
//		System.out.println("두 점 (x1,y1), (x2,y2)의 좌표를 입력하시오 >>"); 
//		Scanner in=new Scanner(System.in); 
//		int x1=in.nextInt(); 
//		int y1=in.nextInt(); 
//		int x2=in.nextInt(); 
//		int y2=in.nextInt(); 
//		
//		//기존 사각형이 입력받은 사각형을 포함시키는 경우
//		if ((x1>=100 & x1<=200) && (y1>=100 && y1<=200)) { 
//			System.out.println("사각형이 겹침"); 
//		}
//		else if((x2>=100 && x2<200) && (y2>=100 && y2<=200)) { 
//			System.out.println("사각형이 겹침"); 
//		}
//		//입력받은 사각형이 기존 사각형을 호함시키는 경우(입력받은 사각형이 더 큰 경우)
//		else if(x1<=100 && x2>=200 && y1<=100 && y2>=200) { 		
//			System.out.println("사각형이 겹침"); 
//		} 
//		else 
//			System.out.println("사각형이 안겹침"); 
//		in.close(); 
//	}
}
