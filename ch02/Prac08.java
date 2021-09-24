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
		
		System.out.print("�� (x1,y1)�� ��ǥ�� �Է��Ͻÿ�>>");
		x1=in.nextInt();
		y1=in.nextInt();
		
		System.out.print("�� (x2,y2)�� ��ǥ�� �Է��Ͻÿ�>>");
		x2=in.nextInt();
		y2=in.nextInt();
		
		//�浹�Ǵ��� �Ǻ�
		
		//���� �簢���� �Է¹��� �簢���� ���Խ�Ű�� ���
		if (inRect(x1,y1,100,100,200,200) || 
				inRect(x2,y2,100,100,200,200) || 
				inRect(x1,y2,100,100,200,200) || 
				inRect(x2,y1,100,100,200,200)) 
			System.out.println("�簢���� ��Ĩ�ϴ�."); 
		else if ((inRect(x1,y1,100,100,200,200)) &&
				inRect(x2,y2,100,100,200,200) && 
				inRect(x2,y1,100,100,200,200) && 
				inRect(x1,y2,100,100,200,200)) 
			System.out.println("�簢���� ��Ĩ�ϴ�."); 
		//�Է¹��� �簢���� ���� �簢���� ȣ�Խ�Ű�� ���(�Է¹��� �簢���� �� ū ���)
		else if ((inRect(100,100,x1,y1,x2,y2)) && 
				inRect(100,200,x1,y1,x2,y2) && 
				inRect(200,100,x1,y1,x2,y2) && 
				inRect(200,200,x1,y1,x2,y2)) 
			System.out.println("�簢���� ��Ĩ�ϴ�.");
		else System.out.println("�簢���� ��ġ�� �ʽ��ϴ�."); 
		
		in.close();
	}
	
//	public static void main(String[] args) { 
//		System.out.println("�� �� (x1,y1), (x2,y2)�� ��ǥ�� �Է��Ͻÿ� >>"); 
//		Scanner in=new Scanner(System.in); 
//		int x1=in.nextInt(); 
//		int y1=in.nextInt(); 
//		int x2=in.nextInt(); 
//		int y2=in.nextInt(); 
//		
//		//���� �簢���� �Է¹��� �簢���� ���Խ�Ű�� ���
//		if ((x1>=100 & x1<=200) && (y1>=100 && y1<=200)) { 
//			System.out.println("�簢���� ��ħ"); 
//		}
//		else if((x2>=100 && x2<200) && (y2>=100 && y2<=200)) { 
//			System.out.println("�簢���� ��ħ"); 
//		}
//		//�Է¹��� �簢���� ���� �簢���� ȣ�Խ�Ű�� ���(�Է¹��� �簢���� �� ū ���)
//		else if(x1<=100 && x2>=200 && y1<=100 && y2>=200) { 		
//			System.out.println("�簢���� ��ħ"); 
//		} 
//		else 
//			System.out.println("�簢���� �Ȱ�ħ"); 
//		in.close(); 
//	}
}
