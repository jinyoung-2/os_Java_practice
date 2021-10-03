// 두 개의 생성자를 가진 Circle 클래스
package oosProject.ch04.실습;

public class 예제4_03 {
    int radius;
    String name;

    public 예제4_03(){     //매개변수 없는 생성자
        radius=1;
        name="";
    }
    public 예제4_03(int radius, String name){     //매개변수를 가진 생성자
        this.radius=radius;
        this.name=name;
    }
    public  double getArea(){
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        예제4_03 pizza = new 예제4_03(10,"자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name+"의 면적은 "+area);

        예제4_03 donut = new 예제4_03();
        donut.name="도넛피자";
        area = donut.getArea();
        System.out.println(donut.name+"의 면적은 "+area);
    }
}
