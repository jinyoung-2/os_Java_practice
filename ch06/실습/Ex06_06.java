package oosProject.ch06.실습;

// 박싱 & 언박싱
public class Ex06_06 {
    public static void main(String[] args) {
        int n = 10;
        Integer intObject = n; // auto boxing
        System.out.println("intObject = " + intObject);
        int m = intObject + 10; // auto unboxing
        System.out.println("m = " + m);
    }
}