package oosProject.ch04.실습;

//두 클래스 Sample과 AccessEx 클래스는 동일한 패키지에 저장된다.
//컴파일 오류를 찾아 내고 이유를 설명하라.

class Sample {
    public int a;
    private int b;      //접근 제어자가 private이므로, 외부 클래스에서 접근불가능하다.
    int c;
}
public class 예제4_10 {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
//        aClass.b = 10;
        aClass.c = 10;
    }
}

