package oosProject.ch10;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;

class MyFrame2 extends JFrame{
    public MyFrame2() {
        setTitle("클릭 연습 용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(null);

        JLabel j=new JLabel("c");
        j.setBounds(100,100,10,10);
        j.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x=(int)(Math.random()*c.getWidth());
                int y=(int)(Math.random()*c.getHeight());
                j.setLocation(x,y);
            }
        });

        c.add(j);

        setSize(300,300);
        setVisible(true);
    }
}

public class prac06 {
    public static void main(String[] args) {
        new MyFrame2();
    }
}


//클릭 연습용 스윙 응용프로그램을 작성하라.
//JLabel을 이용하여 문자열이 "C"인 레이블을 하나만들고 초기 위치를 (100,100)으로 하라.
//문자열을 클릭할 때마다 레이블은 프레임 내의 랜덤한 위치로 움직인다.