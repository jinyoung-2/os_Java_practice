package oos.practice.chap03;

public class Prac10 {
	public static void main(String[] args) {
		
		int[] num[]=new int[4][4];
		int index1,index2;
		
		//10���� �����ϰ� ���� ���� -> ������ ��ġ�� ����
		for(int i=0;i<10;i++) {
			//���� ��ġ ���� -> �������: index1 index2�� ��� �����ؼ��� �� ��
			index1=(int)(Math.random()*4);	//0.0<=  <=3.xx
			index2=(int)(Math.random()*4);
			
			//����ó��-�ٽ� �ε��� ����
			if(num[index1][index2]!=0)
				--i;
			
			//������ ���� ����
			num[index1][index2]=(int)(Math.random()*10)+1;
		}
		
		//������ 6��-> 0
		//ó������ ���� 0���� �ʱ�ȭ�߱� ������ �߰����� �ڵ� �ۼ� ���� ���� �ܰ��!
		
		//���
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) 
				System.out.printf("%-4d",num[i][j]);
			System.out.println();
		}
	}
}
