package day0304;
/* if 조건문 03
 * if-else if 구조
 * 
 * 만약 우리가 if의 조건식이 false가 나올경우
 * else코드 블락을 무조건 실행시키는것이 아니라
 * 다른 조건식을 체크해야 할 경우에는 이렇게if -else if 구조가 나오게 된다.
 * 
 * if - else if의 구조
 * 
 * if(조건식1){
 *      실행할 코드
 * }else if(조건식2) {
 *      실행할 코드
 * }else if(조건식3){
 *      실행할 코드
 *      .....
 * }else{
 *      실행할 코드
 *  }
 *  
 *  단, else 다음에는 else if가 나올수 없다.
 *  왜냐하면 else는 위의 조건식이 false가 나왔을 경우 무조건 else가 실행되기 때문에
 *  그 다음 else if 는 아예 접근이 불가능하기 때문이다.
 *  
 * 
 */

public class Ex06ElseIf {
    public static void main(String[] args) {
        int number =1;
        
        if(number==1) {
            System.out.println("number은 1입니다.");
        }else if(number==2) {
        System.out.println("number은 2입니다.");
        }else if(number==3) {
            System.out.println("number은 3입니다.");
        }else if(number==4) {
            System.out.println("number은 4입니다.");
        }else {
            System.out.println("number은 그 외 입니다.");
        }
        
    }
}
