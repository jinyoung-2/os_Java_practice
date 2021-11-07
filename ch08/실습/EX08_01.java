package oosProject.ch08.실습;

import java.io.FileReader;
import java.io.IOException;

// 예제 8-1 : FileReader로 텍스트 파일 읽기
// FileReader를 이용하여 c:\windows\system.ini 파일을 읽어 화면에 출력하는 프로그램을 작성하라.
// system.ini는 텍스트 파일이다.
public class EX08_01 {
    public static void main(String[] args) {
        FileReader fin = null;
        try{
            fin = new FileReader("c:\\windows\\system.ini");
            int c;
            while((c=fin.read())!=-1){
                System.out.print((char)c);
            }
            fin.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
