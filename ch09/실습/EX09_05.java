package oosProject.ch09.실습;

import javax.swing.*;
import java.awt.*;

//예제 9-5 : GridLayout으로 입력 폼 만들기
public class EX09_05 extends JFrame {
    public EX09_05(){
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5);

        Container c = getContentPane();
        c.setLayout(grid);
        c.add(new JLabel(" 이름"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학번"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학과"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 과목"));
        c.add(new JTextField(""));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EX09_05();
    }
}
