package day0305;
/*사용자로부터 성별, 나이, 신처등급순으로 입력받아
 * 남성이고 19세 이상일시
 * 1-3: 현역
 * 4 공익
 * 그외 면제가 출력되는 프로그램 작성
 * 단 성별을 입력받을때에는 숫자값으로 입력을 받아 1이면 남자 2면 여자로 판정
 * 
 * 단 여성일시 추가적 정보 입력 없이 
 * "여성에게는 국방의 의무가 부여되지 않습니다" 출력
 * 
 * 남자이지만 미성년자 일경우
 * "아직 신체등급이 부여되지 않았습니다" 메세지 출력
 */


import java.util.Scanner;
public class Ex02CategoryCheck {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("성별을 입력하시오 (남자: 1, 여자:2):");
        int gender =scanner.nextInt();
        
        if (gender==1) {
            
            System.out.println("나이를 입력하시오");
            int age = scanner.nextInt();
            
            if(age >=19) {
                
                System.out.println("신체 등급을 입력하시오");
                int grade = scanner.nextInt();
                
                if(grade>=1 && grade <=3) {
                    System.out.println("현역입니다.");
                }else if(grade==4){
                    System.out.println("공익입니다.");
                }else {
                    System.out.println("면제입니다");
                }
            }else {
                System.out.println("아직 신체등급이 부여되지않습니다.");
            }
        }else {
            System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
        }
        scanner.close();
    }
    
    


}
