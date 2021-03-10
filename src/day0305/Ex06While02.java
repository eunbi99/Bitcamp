package day0305;
/*사용자로부터 숫자를 입력받아서
 * 출력하는 프로그램.
 * 단, 사용자가 자연수가 아닌 숫자를 입력한다면
 * 자연수를 입력할때까지 다시 입력을 받는다.
 */
import java.util.Scanner;
public class Ex06While02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("자연수를 입력해주세요 :");
        int number = scanner.nextInt();
        
        while(!(number>=0)) {
            System.out.println("다시 입력해주세요");
            System.out.println("자연수를 입력해주세요");
            number=scanner.nextInt();
        }

        System.out.println("입력한 숫자는 " + number);
        
        
        
        
        
        
        scanner.close();
    }

}
