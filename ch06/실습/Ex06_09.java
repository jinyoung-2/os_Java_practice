package oosProject.ch06.실습;

import java.util.StringTokenizer;

//StringTokenizer 클래스 메소드 활용
public class Ex06_09 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}