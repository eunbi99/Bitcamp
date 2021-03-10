package day0304;
/*사용자로부터 나이를 입력받아서
 * ~5 : 영아
 * ~13 : 어린이
 * ~18 :청소년
 * 그외 ㅣ 성인
 */
import java.util.Scanner;
public class Ex07Checker01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("나이를 입력해주세요:");
        int age =scanner.nextInt();
        
        if(age <6) {
            System.out.println("영아");
        }else if(age<14){
            System.out.println("어린이");
        }else if(age <19) {
            System.out.println("청소년");
        }else {
            System.out.println("성인");
        }
        
        
    }

}
