package oos.practice.chap03;

public class Prac13 {
	public static void main(String[] args) {
		int a,b,cnt;
		
		for(int i=1;i<=99;i++) {
			cnt=0;
			a=i/10;
			b=i%10;
			
			//369 �����ϴ��� �˻� 
			if(a%3==0&&a!=0)	//����)a�� ó������ 0�� ��
				cnt++;			
			if(b%3==0&&b!=0)	//����)b�� ó������ 0�� ��->ex)10,20,30..
				cnt++;
			
//			if(i%10==3||i%10==6||i%10==9)
//				cnt++;
//			if(i/10==3||i/10==6||i/10==9)
//				cnt++;
			
			//cnt 0�� ���
			if(cnt==0)
				continue;
			//cnt 1�� ���
			else if(cnt==1) 
				System.out.println(i+" �ڼ� ¦");
			else if(cnt==2)
				System.out.println(i+" �ڼ� ¦¦");
		}
	}
}



	