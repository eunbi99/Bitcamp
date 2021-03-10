package day0304;

/*사용자로부터 점수를 받아서
 * a,b,c,d,f가 출력돠는 프로그램 작성
 * 
 * 90점 이상:a
 * 80점대 : b
 * 70점대 :c
 * 60점대 :d
 * 그외 :f
 */

import java.util.Scanner;
public class GradeChecker01 {
    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);     
        
        System.out.printf("점수를 입력해주세요 : ");
        int num = scanner.nextInt();
        
        if(num>=90) {
            System.out.println("A");
        }else if(num>=80) {
            System.out.println("B");
        }else if(num >=70) {
            System.out.println("C");
        }else if(num>=60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        scanner.close();
    }
    

}
