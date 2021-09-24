package oos.practice.chap03;

import java.util.Scanner;

public class Prac00 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//숨겨진 카드의 수 맞추는 게임
		int cnt=0;
		int userAns;
		int comAns;
		char yn;
		
		//컴퓨터가 0~99 중 랜던하게 한 개 선택
		comAns=(int)(Math.random()*99);
		
		//사용자 숫자 입력
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		System.out.println("0~99");
		
		//비교
		while(true) {	
			cnt++;
			System.out.print(cnt+">>");
			userAns=in.nextInt();
			
			//판단 
			if(comAns==userAns) {
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n)>>");
				yn=in.next().charAt(0);
				if(yn=='n')	//문자열 비교=>equals()사용, 여기 yn은 문자이므로 yn=='n'사용
					break;
				else {
					System.out.println("수를 결정하였습니다. 맞추어 보세요.");
					System.out.println("0~99");
					cnt=0;
				}
			}
			else if(comAns>userAns) 
				System.out.println("더 높게");
			else	//comAns<userAns
				System.out.println("더 낮게");
			
		}
		//종료
	}
}
