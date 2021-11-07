package oosProject.ch08.실습;

// 예제 8-4 : 키보드 입력을 파일로 저장하기
// Scanner를 이용하여 키보드에서 입력받은 데이터를 c:\Temp\test.txt 파일에 저장하는 프로그램을 작성하라.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EX08_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fout = null;
        int c;
        try{
            fout = new FileWriter("c:\\Temp\\test.txt");
            while(true){
                String line = sc.nextLine();
                if(line.length()==0)
                    break;
                fout.write(line,0,line.length());
                fout.write("\r\n",0,2);
            }
        }catch (IOException e) {
            System.out.println("입출력 오류");
        }
        sc.close();
    }
}
