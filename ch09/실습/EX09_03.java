package oosProject.ch09.실습;

import javax.swing.*;
import java.awt.*;

//예제 9-3 : FlowLayout 배치관리자 활용
public class EX09_03 extends JFrame {
    public EX09_03(){
        setTitle("FlowLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("Calculate"));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EX09_03();
    }
}
