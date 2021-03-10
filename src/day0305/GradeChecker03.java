package day0305;

/*사용자로부터 점수를 받아서
 * a,b,c,d,f가 출력돠는 프로그램 작성
 * 
 * 90점 이상:a
 * 80점대 : b
 * 70점대 :c
 * 60점대 :d
 * 그외 :f
 * 
 * 단 사용자가 잘못된 점수를 입력할 경우
 * 올바른 점수를 입력할때 까지 다시 입력 받으세요.
 */

import java.util.Scanner;
public class GradeChecker03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("점수를 입력해주세요 : ");
        int number= scanner.nextInt();
        
        while(!(number >= 0 && number <=100)) {
            System.out.println("다시입력해주세요");
            System.out.printf("점수를 입력해주세요 : ");
            number= scanner.nextInt();
        }
        
            if(number>=90) {
                System.out.println("A");
               
            }else if(number>=80) {
                System.out.println("B");
               
            }else if(number >=70) {
                System.out.println("C");
                
            }else if(number>=60) {
                System.out.println("D");
             
            }else {
                System.out.println("F");

        }
        scanner.close();
    }
}
