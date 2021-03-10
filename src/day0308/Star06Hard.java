package day0308;

import java.util.Scanner;
public class Star06Hard {
    public static void main(String[] args) {
       // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력해주세요");
        int userNumber= scanner.nextInt();
        
        for(int i =1; i<=userNumber; i++) {
            String stars = new String();
            //공백을 담당하는 j for문
            for(int j=1; j<=i-1; j++) {
                stars+=" ";
            }
            //별을 담당하는 j for문
            for(int j=1; j<=2*userNumber-2*i+1; j++) {
                stars+="*";
            }
            System.out.println(stars);
        }
        
        scanner.close();

    }
}
