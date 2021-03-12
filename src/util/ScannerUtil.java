package util;
/*우리가 Scanner의 메소드를 사용할때
 * 좀더 편리하게 사용할 수 있는 메소드를 우리가 구현해 놓은
 * 클래스
 */
import java.util.Scanner;
public class ScannerUtil {
        /*1.버퍼메모리에 엔터키가 남아있을때
         * 발생하는 nextLine() 버그를 자체적으로 해결한
         * nextLine() 메소드
         */
    public static String nextLine(Scanner scanner, String message) {
        System.out.println(message);
        System.out.print("> ");

        String str = new String(scanner.nextLine());

            /* nextInt 버그 때문에
             * str에 저장된 값이
             * 만약 아무것도 없이 비어있으면
             * str에 다시 한번 new String(scanner.nextLine())해서 리턴한다.
             * 만약 String 객체의 값이 비어있는지 체크할때에는 
             * isEmpty() 메소드를 실행하면
             * 비어있으면 true, 비어있지 않으면 false가 나온다.
             * 즉 isEmpty() 메소드는 
             * equals("")과 똑같다라는 의미가 된다.
             */
            
            if(str.isEmpty()) {
                /*str.isEmpty()가 true가 나왔다는것은
                 * 스캐너 버그때문에 str에 아무런 값이 없다 라는 의미이므로
                 * str에 한번 더 입력을 하게 코드를 넣어주면된다.
                 */
                str = new String(scanner.nextLine());
            }
            return str;
            
        }
        
        //사용자로부터 숫자값을 입력받는
        //nextInt() 메소드
        public static int nextInt(Scanner scanner, String message) {
            System.out.println(message);
            System.out.println(">");
            return scanner.nextInt();
        }
        //사용자로부터 특정 범위내의 숫자값을 입력받는
        //nextInt() 메소드
        public static int nextInt(Scanner scanner, String message , int min , int max) {
            int number =nextInt(scanner, message);
       

            while(!(number >= min && number <=max)) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println(message);
                System.out.println(">");
                number =nextInt(scanner,message);
            }
            
            return number;
        }
}
