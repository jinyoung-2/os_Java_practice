package oos.practice.chap03;

public class Prac10 {
	public static void main(String[] args) {
		
		int[] num[]=new int[4][4];
		int index1,index2;
		
		//10개만 랜덤하게 정수 생성 -> 임의의 위치에 삽입
		for(int i=0;i<10;i++) {
			//임의 위치 선정 -> 고려사항: index1 index2가 모두 동일해서는 안 됨
			index1=(int)(Math.random()*4);	//0.0<=  <=3.xx
			index2=(int)(Math.random()*4);
			
			//예외처리-다시 인덱스 선정
			if(num[index1][index2]!=0)
				--i;
			
			//랜덤한 정수 생성
			num[index1][index2]=(int)(Math.random()*10)+1;
		}
		
		//나머지 6개-> 0
		//처음부터 값은 0으로 초기화했기 때문에 추가적인 코드 작성 없이 다음 단계로!
		
		//출력
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) 
				System.out.printf("%-4d",num[i][j]);
			System.out.println();
		}
	}
}
