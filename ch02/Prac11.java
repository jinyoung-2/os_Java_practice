package oos.practice.chap02;
import java.util.Scanner;
public class Prac11 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month=in.nextInt();
		String season;
		
		//Case 1) if-else�� 
		if(month>=3&&month<=5)
			season="��";
		else if(month>=6&&month<=8)
			season="����";
		else if(month>=9&&month<=11)
			season="����";
		else if(month==12||month==1||month==2)
			season="�ܿ�";
		else
			season="�߸��Է�";
		System.out.println(season);
//		in.close();
		
		//Case 2) switch�� 
		switch(month)
		{
			case 3:
			case 4:
			case 5:
				season="��";
				break;
			case 6:
			case 7:
			case 8:
				season="����";
				break;
			case 9:
			case 10:
			case 11:
				season="����";
				break;
			case 12:
			case 1:
			case 2:
				season="�ܿ�";
				break;
			default:
				season="�߸��Է�";
				break;
		}
		System.out.println(season);
		in.close();
	}
}
