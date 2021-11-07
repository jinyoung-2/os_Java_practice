package oosProject.ch09.실습;

import javax.swing.*;
import java.awt.*;

//예제 9-6 : 배치관리자 없는 컨테이너에 컴포넌트를 절대 위치와 크기로 지정
public class EX09_06 extends JFrame {
    public EX09_06(){
        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(130,50);
        la.setSize(200,20);
        c.add(la);

        for(int i=1;i<=9;i++){
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i*15,i*15);
            b.setSize(50, 20);
            c.add(b); // 버튼을 컨텐트팬에 부착

        }

        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new EX09_06();
    }
}
