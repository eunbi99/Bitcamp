package day0303;
/* 기본형 데이터타입 02
 * 
 * 실수형 데이터타입
 * 실수형 데이터타입에는
 * float(32비트)과 double(64비트)가 있다,
 * java에서는 실수에 대한 기본 데이터타입을 double로 설정해놓았다.
 * 그러므로 우리도 double을 사용하면 된다!
 */
public class Ex01RealNumber {
    public static void main(String[] args) {
        double myDouble;
        
        myDouble=1.234;
        
        System.out.println(myDouble);
        
        //정수 - 실수 타입 캐스팅을 직접 체험해보자
          //1. 정수형 값을 실수 공간에 할당하는 암시적 형변환
        
         //2.myDouble에 5를 할당해보자
        
        myDouble=5;
        System.out.println(myDouble);
        
        //2. 실수형 값을 정수 공간에 할당하는 명시적 형 변환
        //myDouble에 3.9할당.
        myDouble=3.9;
        
        int myInt;
        
        myInt = (int)myDouble;
        System.out.println(myInt);
         
        
       //float변수 (상수)에 값을 넣는 두가지 방법
       //1.코드에 적혀있는 실수를 명시적 형 변환을 통해 float으로 바꿔주는 방법
        float myFloat;
        
        //myFolat에 3.4를 명시적 형변환을 통해 float으로 바꾸어서 할당해라.
        
        myFloat =(float) 3.4;
        System.out.println(myFloat);
        
        //2.우리가 코드에 적은 실수가 double이 아니라 float이라고 미리 말해주는 방법.
        //float타입을 가진 실수값을 만들려면 실수값에 f를 붙여주면 된다.
        myFloat = 9.9f;
        System.out.println(myFloat);
    }

}
