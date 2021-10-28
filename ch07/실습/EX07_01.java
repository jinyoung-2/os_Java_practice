package oosProject.ch07.실습;

import java.util.Vector;

// 정수만 다루는 Vector<Integer> 컬렉션 활용
public class EX07_01 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(5);
        v.add(4);
        v.add(-1);

        // 벡터 중간에 삽입하기
        v.add(2,100);    // 4와 -1 사이에 정수 100 삽입

        System.out.println("벡터 내의 요소 객체 수 : " + v.size());
        System.out.println("벡터의 현재 용량 : " + v.capacity());

        // 모든 요소 정수 출력하기
        for(int i=0; i<v.size(); i++) {
            int n = v.get(i);
            System.out.println(n);
        }

        // 벡터 속의 모든 정수 더하기
        int sum = 0;
        for(int i=0; i<v.size(); i++) {
            int n = v.elementAt(i); //v.element(i)와 v.get(i)와 동일
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : "+sum);
    }
}
