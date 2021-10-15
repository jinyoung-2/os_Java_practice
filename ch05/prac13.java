package oosProject.ch05;

public class prac13 {
    public static void main(String[] args) {
        Shape donut = new Circle2(10);   //반지름이 10인 원 객체
        donut.redraw();
        System.out.println("면적은 "+donut.getArea());
    }
}

class Circle2 implements Shape{
    private int radius;
    public Circle2(int radius){
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 "+radius+"인 원입니다.");
    }

    @Override
    public double getArea() {
        return radius*radius*PI;
    }
}