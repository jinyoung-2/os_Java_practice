package oosProject.ch07;

import java.util.*;

public class prac02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> scoreList = new ArrayList<>(6);
        double sum = 0.0, average=0.0;
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        String score = in.nextLine();
        StringTokenizer st = new StringTokenizer(score," ");
        while(st.hasMoreTokens()){
            scoreList.add(st.nextToken().trim());
        }
        for(int i=0;i<scoreList.size();i++){
            switch (scoreList.get(i)){
                case "A":
                    sum+=4.0;
                    break;
                case "B":
                    sum+=3.0;
                    break;
                case "C":
                    sum+=2.0;
                    break;
                case "D":
                    sum+=1.0;
                    break;
                case "F":
                    sum+=0.0;
                    break;
            }
        }
        average=sum/6;
        System.out.println(average);
    }
}
