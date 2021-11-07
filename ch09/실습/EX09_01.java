package oosProject.ch09.실습;

import javax.swing.*;

//예제 9-1 : 300x300 크기의 스윙 프레임 만들기
public class EX09_01 extends JFrame {

    public EX09_01(){
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300); // 프레임 크기 300x300
        setVisible(true); // 프레임 출력
    }

    public static void main(String[] args) {
        new EX09_01();
    }
}
