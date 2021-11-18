package oosProject.ch10;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;

class MyFrame extends JFrame{
    public MyFrame() {
        setTitle("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        JLabel j=new JLabel("Love Java");
        c.add(j);
        c.setFocusable(true);
        c.requestFocus();
        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_LEFT) {
                    String text=j.getText();
                    j.setText(text.substring(1)+text.charAt(0));
                }
            }
        });

        setSize(300,300);
        setVisible(true);
    }
}

public class prac04 {
    public static void main(String[] args) {
        new MyFrame();
    }
}



//JLabel을 활용하여 "Love Java"를 출력하고 왼쪽 화살표 키(<Left>키)를 입력할 때마다
//"ove JavaL", "ve JavaLo", "e JavaLov" 등과 같이 계속 한 문자씩 왼쪽으로 이동하는 스윙 프로그램을 작성하라.
//문자열의 이동은 String 클래스의 substring() 메소드를 이용하여 구현하라.
//String text = "Love Java"인 경우, text.substring(0,1)은 "L"을 리턴하고, text.substring(1)은
//"ove Java"를 리턴한다. JLavel에 포커스 설정하는 것을 잊지 말아야한다.