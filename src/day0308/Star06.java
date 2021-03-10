package day0308;

import java.util.Scanner;
public class Star06 {
    public static void main(String[] args) {
       // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력해주세요");
        int userNumber= scanner.nextInt();
        
        for(int i=1; i<=userNumber; i++) {
            String star = new String();
            star += "*";
            for(int j=1; j<=i-1; j++) {
                System.out.printf(" ");
            }   
            for(int j=2*userNumber -1; j>=2*i-1; j--) {
                System.out.printf(star);
            }
            System.out.println();
        }
    }

}
