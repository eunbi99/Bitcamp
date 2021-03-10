package day0308;

import java.util.Scanner;
public class Star05 {
    public static void main(String[] args) {
       // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력해주세요");
        int userNumber= scanner.nextInt();
        
        for(int i=1; i<=userNumber; i++) {
            String star = new String();
            
            
            //공백을 담담하는 j for문
            for(int j=1; j<=userNumber-i; j++) {
                System.out.printf(" ");
                
                //userNumber가 5, i가 1일경우
                //for(j=1; j<=5-1; j++)
                //star ->"";
                //j : 1 -> star ="" + " "; ->star =" ";
                //j : 2 -> star =" " + " "; -> star = " ";
                //j : 3 -> star ="  "+ " "; -> star = "   ";
                //j : 4 -> star ="   "+ " "; -> star= "    ";
            }
            
            //별을 담당하는 j for문
            for(int j=1; j<=2*i-1; j++) {
                star+="*";
               
            }
            System.out.println(star);
        }
       scanner.close();         
}
}
