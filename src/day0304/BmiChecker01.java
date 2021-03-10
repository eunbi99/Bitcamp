package day0304;
/*사용자로부터 키와 몸무게를 입력받아서
 * 사용자의 bmi 수치를 소숫점 2번째 자리까지 출력하고
 * 사용자의 체형이 어디에 속하는지도 출력하시오
 * 
 * bmi공식 :몸무게 (kg) /키(m)/키 (m)
 * 체형기준
 * ~18.5 미만: 저체중
 * ~23 미만 :정상
 * ~25미만: 과체중
 * 그외 :비만
*/

import java.util.Scanner;
public class BmiChecker01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("키를 입력해주세요 : ");
        double m =scanner.nextDouble();
        
        System.out.printf("몸무게를 입력해주세요 : ");    
        int kg = scanner.nextInt();
        
        int bmi= kg/(int)(m*m);
        
        if(bmi <18.5) {
            System.out.println("저체중");
        }else if(bmi <23) {
            System.out.println("정상");
        }else if(bmi <25) {
            System.out.println("과체중");
        }else {
            System.out.println("비만");
        }
        scanner.close();
    }
    

}
