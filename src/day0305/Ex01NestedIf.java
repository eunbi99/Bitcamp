package day0305;
/*중첩 if 문
 * 중첩 if문은 한개의 if문 안에 또 다른 if문이 들어오는 구조이다.
 * 우리가 특정 코드를 조건을 만족할 시에만 실행시킬때 if문을 사용하게되는데
 * 만약 특정 조건을 체크해서 코드를 실행하고 그 안에서 다시 다른 조건을 체크해야한다면
 * 이렇게 중첩if문을 사용해야한다.
 * 
 */
public class Ex01NestedIf {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int number=4;
        
        //먼저 number가 자연수인지 아닌지를 확인하는 if문을 만들어준다.
        if(number >= 0) {
            System.out.println("자연수입니다.");
            
            if(number <10) {
                System.out.println("한자리 자연수입니다.");
            }else if(number < 100) {
                System.out.println("두자리 자연수입니다.");
            }else if(number <1000) {
                System.out.println("세자리 자연수 입니다.");
            }else {
                System.out.println("네자리 이상의 자연수입니다.");
            }
        }else {
            System.out.println("자연수가 아닙니다.");
        }

    }

}
