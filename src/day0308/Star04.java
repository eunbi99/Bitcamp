package day0308;

import java.util.Scanner;

public class Star04 {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner scanner = new Scanner(System.in);
            System.out.println("출력할 줄 수를 입력해주세요");
            int userNumber= scanner.nextInt();
            
            for(int i =1; i<=userNumber; i++) {
                String stars = new String();
                
                //공백을 담당하는 j for문
                for(int j=1; j<=i-1; j++) {
                    stars += " ";
                }
                //별을 담당하는 j for문
                for(int j=i; j<=userNumber; j++) {
                    stars += "*";
                }
                
                System.out.println(stars);
            }
            /*내 답
            for(int i=userNumber; i>=1; i--) {
                String star= new String();
                star+="*";
                for(int j=0; j<=userNumber-i-1; j++) {
                    System.out.printf(" ");
                }
                for(int j=i; j>=1; j--) {
                    System.out.printf(star);
                }
                
                System.out.println();
            }
            */
        }
}
