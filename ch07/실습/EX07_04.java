package oosProject.ch07.실습;

import java.util.Iterator;
import java.util.Vector;

// Iterator를 이용하여 Vector의 모든 요소를 출력하고 합 구하기
public class EX07_04 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2,100);

        // Iterator를 이용한 모든 정수 출력하기
        Iterator<Integer> it = v.iterator();
        while(it.hasNext()){
            int n=it.next();
            System.out.println(n);
        }

        // Iterator를 이용하여 모든 정수 더하기
        int sum=0;
        it=v.iterator();
        while(it.hasNext()){
            int n=it.next();
            sum+=n;
        }
        System.out.println("벡터에 있는 정수 합 : " +sum);
    }
}
