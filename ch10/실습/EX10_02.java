package oosProject.ch10.실습;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//예제 10-2 : 내부 클래스로 Action 이벤트 리스너 만들기
public class EX10_02 extends JFrame{

    EX10_02(){
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener()); // Action 리스너 달기
        c.add(btn);

        setSize(350, 150);
        setVisible(true);
    }

    private class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("Action"))
                b.setText("액션");
            else
                b.setText("Action");
            //Ex10_02의 멤버나 JFrame의 멤버 호출 가능
            EX10_02.this.setTitle(b.getText()); //프레임타이틀에 버튼 문자열 출력
        }
    }

    public static void main(String[] args) {
        new EX10_02();
    }
}
