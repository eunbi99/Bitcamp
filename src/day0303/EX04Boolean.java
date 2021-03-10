package day0303;
/* 기본형 데이터 타입03
 * 논리형
 * 
 * 논리형 데이터타입에는 boolean이라는 데이터타입 1개만 존재한다.
 * 이 boolean 데이터타입은 단 두가지의 값만 존재하는데
 * 하나는 true , 하나는 false 라는 값이다
 * 
 * boolean의 경우 우리가 특별히 변수를 만들어서 쓰기 보다는
 * 나중에 배우게 될 연산자 혹은 메소드의 결과물을 받아서 쓰는 경우가 대부분이다.
 * 
 */
public class EX04Boolean {
    public static void main(String[] args) {
        //boolean 변수 myBoolean을 만들고 거기에 true 할당
        
        boolean myBoolean= true;
        System.out.println(myBoolean);
        
        //false 할당
        myBoolean =false;
        System.out.println(myBoolean);
                
    }

}
