//Circle 클래스의 객체 생성 및 활용
package oosProject.ch4;

public class Circle_예제4_1 {    //Circle 클래스
    private int radius;
    private String name;

    Circle_예제4_1(){}

    public double getArea(){
        //return 3.14*radius*radius;
        return 3.14*Math.pow(radius,2);
    }

    public static void main(String[] args) {
       Circle_예제4_1 pizza = new Circle_예제4_1();
       pizza.name = "자바피자";
       pizza.radius = 10;
       double area = pizza.getArea();
       System.out.println(pizza.name+"의 면적은 "+area);

       Circle_예제4_1 donut = new Circle_예제4_1();
       donut.name = "자바도넛";
       donut.radius = 2;
       area = donut.getArea();
       System.out.println(donut.name+"의 면적은 "+area);
    }
}
