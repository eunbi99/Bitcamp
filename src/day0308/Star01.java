package day0308;


import java.util.Scanner;
public class Star01 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력해주세요");
        int userNumber= scanner.nextInt();
        
        for(int i=1; i<=userNumber; i++) {
            String star = new String();
            for(int j=1; j <=i; j++) {
                star+="*";
        }
            System.out.println(star);
        }
        scanner.close();
    }
   

}
