package oosProject.ch08.실습;

import java.io.FileInputStream;
import java.io.IOException;

//예제 8-6 : FileInputStream으로 바이너리 파일 읽기
//FileInputStream을 이용하여 c:\Temp\test.out 파일(예제 8-5에서 저장한 파일)을 읽어 byte [] 배열 속에 저장하고 화면에 출력하라
public class EX08_06 {
    public static void main(String[] args) {
        byte b[] = new byte [6]; // 비어 있는 byte 배열
        try {
            FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
            int n=0, c;
            while((c = fin.read())!= -1) {
                b[n] = (byte)c;
                n++;
            }
            System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
            for(int i=0; i<b.length; i++) System.out.print(b[i] + " ");
            System.out.println();
            fin.close();
        } catch(IOException e) {
            System.out.println( "c:\\Temp\\test.out에서 읽지 못했습니다. 경로명을 체크해보세요");
        }
    }
}
