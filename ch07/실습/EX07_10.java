package oosProject.ch07.실습;

//  스택의 내용을 반대로 만드는 제네릭 메소드 만들기
// 예제 7-9의 GStack을 이용하여 주어진 스택의 내용을 반대로 만드는 제네릭 메소드 reverse()를 작성하라.
public class EX07_10 {
    public static <T> GStack<T> reverse(GStack<T> a){
        GStack<T> s = new GStack<T>();
        while (true) {
            T tmp;
            tmp = a.pop(); // 원래 스택에서 요소 하나를 꺼냄
            if (tmp==null) // 스택이 비었음
                break;
            else
                s.push(tmp); // 새 스택에 요소를 삽입
        }
        return s; // 새 스택을 반환
    }

    public static void main(String[] args) {
        // Double 타입의 GStack 생성
        GStack<Double> gs =
                new GStack<Double>();
        // 5개의 요소를 스택에 push
        for (int i=0; i<5; i++) {
            gs.push(new Double(i));
        }
        gs = reverse(gs);
        for (int i=0; i<5; i++) {
            System.out.println(gs.pop());
        }
    }
}
