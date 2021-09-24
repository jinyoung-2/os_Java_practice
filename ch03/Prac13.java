package oos.practice.chap03;

public class Prac13 {
	public static void main(String[] args) {
		int a,b,cnt;
		
		for(int i=1;i<=99;i++) {
			cnt=0;
			a=i/10;
			b=i%10;
			
			//369 만족하는지 검사 
			if(a%3==0&&a!=0)	//예외)a가 처음부터 0일 때
				cnt++;			
			if(b%3==0&&b!=0)	//예외)b가 처음부터 0일 때->ex)10,20,30..
				cnt++;
			
//			if(i%10==3||i%10==6||i%10==9)
//				cnt++;
//			if(i/10==3||i/10==6||i/10==9)
//				cnt++;
			
			//cnt 0인 경우
			if(cnt==0)
				continue;
			//cnt 1인 경우
			else if(cnt==1) 
				System.out.println(i+" 박수 짝");
			else if(cnt==2)
				System.out.println(i+" 박수 짝짝");
		}
	}
}



	