package oosProject.ch4;

import java.util.Scanner;

//객체배열
class Prac05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle[] c = new Circle[3];     //3개의 Circle 객체 생성
        for(int i=0;i<c.length;i++){
            System.out.print("x, y, radius >>");
            double x = in.nextDouble();
            double y = in.nextDouble();
            int radius = in.nextInt();
            c[i] = new Circle(x,y,radius);    //Circle 객체 생성
        }
        for(int i=0;i<c.length;i++)
            c[i].show();
        in.close();
    }
}

class Circle{
    private double x,y;
    private int radius;

//    public Circle(){
//        this(0,0,1);
//    }
    public Circle(double x, double y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
}