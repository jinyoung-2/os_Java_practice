package oosProject.ch4;

import java.util.Scanner;

class Prac06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle2[] c = new Circle2[3];     //3개의 Circle 객체 생성
        for(int i=0;i<c.length;i++){
            System.out.print("x, y, radius >>");
            double x = in.nextDouble();
            double y = in.nextDouble();
            int radius = in.nextInt();
            c[i] = new Circle2(x,y,radius);    //Circle 객체 생성
        }

        int maxIndex = 0;
        for(int i=1;i<3;i++) {
            if (c[maxIndex].getRadius() < c[i].getRadius())
                maxIndex = i;
        }
        System.out.println("가장 면적인 큰 원은 ("+c[maxIndex].getX()+","+c[maxIndex].getY()+")"+c[maxIndex].getRadius());
        in.close();

//        int max = 0;
//        for(int i=0;i<c.length;i++){    //가장 긴 radius찾기
//            if(max<c[i].getRadius())
//                max=c[i].getRadius();
//        }
//        for(int i=0;i<c.length;i++){
//            if(max==c[i].getRadius()){  //가장 긴 radius를 갖는 객체찾아 결과출력
//                System.out.print("가장 면적인 큰 원은");
//                c[i].show();
//            }
//        }
    }
}

class Circle2{
    private double x,y;
    private int radius;

    public Circle2(){
        this(0,0,1);
    }
    public Circle2(double x, double y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    //가장 면적인 큰 원 찾는 메서드
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public int getRadius(){
        return radius;
    }
}