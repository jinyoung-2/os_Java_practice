package oosProject.ch06.실습;

//Object 클래스로 객체 속성 알아내기

class Point {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Ex06_01 {
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName()); // 클래스 이름
        System.out.println(obj.hashCode()); // 해시 코드 값
        System.out.println(obj.toString()); // 객체를 문자열로 만들어 출력
        System.out.println(obj); // 객체 출력
    }
    public static void main(String [] args) {
        Point p = new Point(2,3);
        print(p);
        //Q. static 메서드인 print를 클래스이름.메서드이름()형태로 작성하지 않아도 되는 이유는 무엇인가요?
        //class Ex06_12 안의 메서드끼리는 메서드이름만으로 호출해도 되기 때문에 그런건가요?

    }
}