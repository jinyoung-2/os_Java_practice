//Rectangle 클래스 만들기 연습
package oosProject.ch4;

import java.util.Scanner;

public class Rectangle_예제4_2 {    //Rectangle 클래스
    private int width;
    private int height;

    Rectangle_예제4_2(int width,int height){
        this.width=width;
        this.height=height;
    }

    public int getArea(){
        return width*height;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print(">> ");
        int width = in.nextInt();
        int height = in.nextInt();
        Rectangle_예제4_2 rect = new Rectangle_예제4_2(width,height);

        System.out.println("사각형의 면적은 "+rect.getArea());
        in.close();
    }
}
