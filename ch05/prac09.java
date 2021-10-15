package oosProject.ch05;

import java.util.Scanner;

interface Stack {
    int length();   //현재 스택에 저장된 개수 리턴
    int capacity(); //스택의 전체 저장 가능한 개수 리턴
    String pop();   //스택의 top에 실수 저장
    boolean push(String val);   //스택의 top에 저장된 실수 리턴
}

class StringStack implements Stack{
    private int num;    //저장 가능한 개수
    private int set;    //stack top 인덱스
    private String[] stack; //스택

    public StringStack(int num){
        this.num=num;
        this.set=-1;    //주의사항:: 내가 푼 코드에서 set=0으로 설정시 오류 발생
        stack = new String[num];
    }

    @Override
    public int length(){
        return set+1;
    }

    @Override
    public int capacity() {
        return stack.length;
    }

    @Override
    public String pop() {
        if(set<0)
            return null;
        return stack[set--];
    }

    @Override
    public boolean push(String val) {
        if(set+1>=num)
            return false;
        stack[++set]=val;
        return true;
    }
}

public class prac09{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int num=in.nextInt();

        //객체 생성
        StringStack stack = new StringStack(num);

        while(true){
            System.out.print("문자열 입력 >> ");
            String str = in.next();
            if(str.equals("그만")){
                break;
            }
            //그만이 아니면,
            if(!stack.push(str))
                System.out.println("스택이 꽉 차서 푸시 불가!");
        }
        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        while(stack.length()>0){
            System.out.print(stack.pop()+" ");
        }
        in.close();
    }
}