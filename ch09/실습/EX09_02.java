package oosProject.ch09.실습;

import javax.swing.*;
import java.awt.*;

//예제 9-2 : 3개의 버튼 컴포넌트를 가진 스윙프레임 만들기
public class EX09_02 extends JFrame {
    public EX09_02(){
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EX09_02();
    }
}
