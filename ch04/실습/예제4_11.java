package oosProject.ch04.실습;

// 전역 함수로 작성하고자 하는 abs, max, min의 3개 함수를
// static 메소드로 작성하고 호출하는 사례를 보여라
public class 예제4_11 {
    public static void main(String[] args) {
        //static 멤버를 가진 클래스는 객체 생성없이 사용 가능
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10,8));
        System.out.println(Calc.min(-3,-8));
    }
}

class Calc{
    public static int abs(int a){
        return a>0?a:-a;
    }

    public static int max(int a,int b){
        return a>b?a:b;
        //return Math.max(a,b);
    }

    public static int min(int a,int b){
        return a>b?b:a;
        //return Math.min(a,b);
    }
}
