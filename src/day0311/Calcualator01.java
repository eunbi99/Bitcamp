package day0311;
/*사용자가 2가지 숫자를 입력하면
 * 해당 숫자를 산술 연산하여 출력하는 프로그램을 작성하시오.
 * 
 * 단, +,-는 메소드가 출력까지 담당하고
 *  *,/,%는 메소드가 결과값을 리턴만 해줍니다.
 *  또한 / 의 경우, 결과값이 실수의 형태가 나오도록 메소드를 작성하시오,
 */
import java.util.Scanner;
public class Calcualator01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO Auto-generated method stub
        System.out.println("첫번째 숫자");
        int num1 = scanner.nextInt();
        System.out.println("두번째 숫자");
        int num2 = scanner.nextInt();
      
        plus(num1 , num2);
        minus(num1, num2);
        
        System.out.println("a * b : " + multiply(num1,num2));
        System.out.println("a / b : " + divide(num1,num2));
        System.out.println("a % b : " + remain(num1,num2));
        scanner.close();
    }

    
    public static void plus(int a , int b) {
        System.out.println("a + b :"+(a+b));

    }
    
    public static void minus(int a , int b) {
        System.out.println("a - b :"+(a-b));

    }
    
    public static int multiply(int a , int b) {
        return a*b;
    }
    
    public static double divide(int a , int b) {
        return (double)a/b;
    }
    
    public static int remain(int a , int b) {
        return a%b;
    }
    
}
