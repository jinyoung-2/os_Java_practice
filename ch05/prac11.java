package oosProject.ch05;

import java.util.Scanner;

//주의사항::추상메서드는 abstract keyword 붙이기!!
abstract class Calc{
    protected int a;
    protected int b;
    public void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }
    abstract int calculate();   //추상메서드
}

class Add extends Calc{
    public int calculate(){
        return a+b;
    }
}

class Sub extends Calc{
    public int calculate(){
        return a-b;
    }
}

class Mul extends Calc{
    public int calculate(){
        return a*b;
    }
}

class Div extends Calc{
    public int calculate(){
        if(b==0)    //예외처리
            return -1;
        return a/b;
    }
}

class Prac11 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오 >> ");
        int a = in.nextInt();
        int b = in.nextInt();
        char ch = in.next().charAt(0);
        int result=0;

        //중요 Point:: 다형성!!
        Calc cal;
        switch (ch){
            case '+':
                cal=new Add();
                break;
            case '-':
                cal=new Sub();
                break;
            case '*':
                cal=new Mul();
                break;
            case '/':
                cal=new Div();
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                in.close();
                return ;
        }

        //결과출력
        cal.setValue(a,b);
        result=cal.calculate();
        /*
        * Calc클래스에 calculate메서드가 비록 추상메서드로 정의되어 있더라도,
        * Calc클래스 타입의 참조변수로 calculate메서드를 호출하는 것이 가능하다!
        *
        * 메서드는 참조변수의 타입에 관계없이 실제 인스턴스에서 구현된 것이 호출되기 때문
        *
        * 단, Calc클래스에 calculate메서드가 존재하지 않다면,
        * Calc클래스 타입의 참조변수로 calculate메서드 호출 불가능함!!
        * */
        System.out.println(result);
        in.close();
    }
}