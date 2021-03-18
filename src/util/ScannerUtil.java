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
        //사용자로부터 nextInt()를 실행할때 곧장 int로 입력받는것이 아니라
        //String으로 입력을 받고, 해당 String 값이 숫자로만 이루어져있는지 체크하여
        //만약 숫자 외의 글자가 존재 할 시에는 "숫자만 입력해주세요" 라는 메시지와 함께
        //계속 입력을 받게 해준다.
        //만약 사용자가 숫자만 입력하면
        //Integer 클래스의 static 메소드인 parseInt()메소드를 호출하여
        //String을 int로 변환해준다.
    
        
        //사용자로부터 숫자값을 입력받는
        //nextInt() 메소드
        public static int nextInt(Scanner scanner, String message) {
            //1. 먼저 사용자로부터 값을 String의 형태로 입력받는다.
            String temp = nextLine(scanner, message);
            
            //2.temp가 숫자로만 이루어져있는지 체크해서, 아닐경우엔
            //  숫자만 입력될때 까지 다시 입력받는다.
            while( !temp.matches("\\d+")) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("숫자만 입력하실수 있습니다.");
                temp = nextLine(scanner,message);
                
            }
            //3.while이 종료되었다는 의미는
            //  temp가 숫자로만 이루어져있다 라는 의미이므로
            //  Integer.parseInt()를 통해서
            //  String temp의 값을 int타입의 값으로 바꿔준다.
            //  그리고 해당 int값을 return 해준다.
            return Integer.parseInt(temp);
        }
        //사용자로부터 특정 범위내의 숫자값을 입력받는
        //nextInt() 메소드
        public static int nextInt(Scanner scanner, String message , int min , int max) {
            String temp = nextLine(scanner, message);
            
            while(!temp.matches("\\d+")) {
                System.out.println("잘못 입력하셨습니다.");
            }
       
            while(!(number >= min && number <=max)) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println(message);
                System.out.println(">");
                number =nextInt(scanner,message);
            }
            
            return number;
        }
}
