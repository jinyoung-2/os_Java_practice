package oos.practice.chap02;
import java.util.Scanner;
public class Prac00 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		String str1=in.next();		//String str1=in.nextLine();
		System.out.print("���� >> ");
		String str2=in.next();		//String str2=in.nextLine();
		
		//���ڿ� �� => equals()
		//��� ��
		if(str1.equals(str2)){
			System.out.println("�����ϴ�.");
			return ;
		}
		
		//���ڰ� ���� ��
		//ö�� �¸�
		if(str1.equals("����")&&str2.equals("��"))
			System.out.println("ö���� �̰���ϴ�.");
		else if(str1.equals("��")&&str2.equals("����"))
			System.out.println("ö���� �̰���ϴ�.");
		else if(str1.equals("����")&&str2.equals("����"))
			System.out.println("ö���� �̰���ϴ�.");
		
		//���� �¸�
		if(str2.equals("����")&&str1.equals("��"))
			System.out.println("���� �̰���ϴ�.");
		else if(str2.equals("��")&&str1.equals("����"))
			System.out.println("���� �̰���ϴ�.");
		else if(str2.equals("����")&&str1.equals("����"))
			System.out.println("���� �̰���ϴ�.");
		
		in.close();
	}
}
