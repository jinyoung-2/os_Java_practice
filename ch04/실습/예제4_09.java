//가비지의 발생
package oosProject.ch04.실습;

public class 예제4_09 {
    public static void main(String[] args) {
        String a = "Good";
        String b = "Bad";
        String c = "Normal";
        String d,e;     //null로 자동 초기화

        a=null;         //가비지 발생
        d=c;
        c=null;
    }
}

