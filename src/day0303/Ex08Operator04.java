package day0303;
//연산자 04
/*논리연산자
 * 
 * 논리연산자는 true/false 값을 가진 boolean 값의 연산에서 사용이 된다.
 * 
 * &&,||,!
 */
public class Ex08Operator04 {
    public static void main(String[] args) {
        /* 1. &&연산자 (AND 연산자)
         *    AND연산자는 왼쪽의 boolean값과 오른쪽의 boolean 값이 모두 true일때에만
         *    결과값이 true가 나온다.
         *    
         */
        System.out.println("1. && 연산자");
        System.out.println("true && true : " + (true && true));
        System.out.println("true && false : " + ( true && false));
        System.out.println("false && true : " + (false && true));     //노란줄이 쳐진 이유 : 앞이 이미 false이기때문에 뒤에
        System.out.println("false && false : " + (false && false ));  //뭐가 나오던지 false이기때문에 죽은 코드인것을 알려준다.
        
        /*2. ||연산자 (OR 연산자)
         *  OR연산자는 왼쪽의 boolean 값과 오른쪽의 boolean 값 중 한개라도 true이면
         *  결과값은 true가 나온다.
         *  
         */
        
        System.out.println("2.||연산자");
        System.out.println("true || true :" + (true || true));
        System.out.println("true || false :" + (true || false));
        System.out.println("false || true :" + (false || true));
        System.out.println("false || false :" + (false || false));
        
        /* 3. !연산자 (NOT 연산자)
         * NOT 연산자는 true는 false로, false는 true 로 바꾼 결과값을 제공한다.
         */
        
        System.out.println("3.! 연산자");
        System.out.println("!true : " + !true);
        System.out.println("!false : " + !false);
        
        /*그렇다면 우리가 아까 비교연산자를 배울때
         * 값이 특정 범위에 속하는지 알고 싶을 때에는
         * 최소값 < 변수 < 최대값으로 할 수가 없다고 했었다.
         * 
         * 대신 이렇게 범위를 검사할때 에는 우리가 논리연산자를 사용해서 
         * 변수가 특정 범위에 속하는지 확인 할 때에는
         * 최소값 <변수 && 변수 < 최대값
         * 처럼 && 연산자를 사용해서 2개를 모두 만족하는지를 체크해야한다.
         * 
         */
        
        int number=3;
        //만약 number가 0~10 사이의 숫자인지 확인하려면?
        System.out.println("number >= 0 && number <=10 : " + (number >=0 && number <=10));
        
    }

}
