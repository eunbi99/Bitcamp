package day0303;
/* 연산자 03
 * 비교연산자
 * 
 * 비교연산자는 우리가 사용한 연산자가 맞는지 틀린지를 판정해준다.
 * 즉, 비교연산자의 결과값은 true 혹은 false 값을 갖는 boolean 형이 되게 된다.
 * <,<=,>,>= ,==,!=
 * 
 */
public class Ex07Operateor03 {
    public static void main(String[] args) {
        //3이할당된 int변수 number를 선언과 초기화
        int number =3;
        //1. <은 왼쪽값이 오른쪽 값보다 작으면 true, 크거나 같으면 false
        
        System.out.println("number < 10 : " + (number < 10));
        System.out.println("number < 0 : " + (number < 0));
        System.out.println("number < 3 : " + (number <3));
        System.out.println("=============================");
        
        //2. <= 왼쪽 값이 오른쪽 값보다 작거나 같으면 true , 크면 false 
        System.out.println("number <= 10 : " + (number <= 10));
        System.out.println("number <= 0 : " + (number <= 0));
        System.out.println("number <= 3 : " + (number <= 3));
        System.out.println("=============================");
        
        //3. >은 왼쪽 값이 오른쪽 값보다 크면 true , 작거나 같으면 false 가 나온다.
        System.out.println("number > 10 : " + (number > 10));
        System.out.println("number > 0 : " + (number > 0));
        System.out.println("number > 3 : " + (number > 3));
        System.out.println("=============================");
        
        //4. >= 왼쪽 값이 오른쪽 값보다 크거나 같으면 true , 작으면 false 
        System.out.println("number >= 10 : " + (number >= 10));
        System.out.println("number >= 0 : " + (number >= 0));
        System.out.println("number >= 3 : " + (number >= 3));
        System.out.println("=============================");
        
        //5. ==은 왼쪽값과 오른쪽 값이 같으면 true, 다르면 false 
        System.out.println("number == 3 : " + (number == 3));
        System.out.println("number == 5 : " + (number == 5));
        System.out.println("=============================");
        
        //6. !=은 왼쪽값이 오른쪽 값과 다르면 true, 같으면 false가 나온다.
        System.out.println("number != 3 : " + (number != 3));
        System.out.println("number != 5 : " + (number != 5));
        
        
        //비교연산자를 사용할때 주의점
        System.out.println("=============================");
        //1.어떤 값이 특정 범위에 속하는지 알고 싶을때에는
        //최소값 < 알고싶은값 < 최대값으로 하면 에러가 난다.
        //System.out.println(0< number < 10);
        //위코드에 사람은 당연히 0 < number과 number <10이 true 가 나오는지 확인하겠지만 컴퓨터는
        // 먼저 0 < number 을 실행하여 결과값을 받는다, 그 결과 값은 true.false 값을 가진 boolean 이다.
        //그리고 나소 true 혹은 false가 10보다 작은지 체크하려고 하면 이해할 수 없는 코드가 되기때문에 에러가 발생.
        //따라서 우리가 값이 범위에 속하는지 체크하려면 논리 연산자를 사용해야한다.
        
        /* 2.변수와 변수가 아닌 값 자체를 비교할때는 변수를 왼쪽에 두는것이 좀 더 가독성이 좋다.
         * 
         * 
         * 3. 참조형 변수의 값을 비교할때에 비교연산자를 사용하게 된다면 부정확한 결과값을 얻을 가능성이 매우 높다.
         * 참조형 변수거 필요하니깐 String 객체를 3개 만들어보자.
         */
        
        String str1 = new String("가나다라");
        String str2 = "가나다라";
        String str3 = str2;
        
        System.out.println("str1의 현재값 : [" + str1 + "]");
        System.out.println("str2의 현재값 : [" + str2 + "]");
        System.out.println("str3의 현재값 : [" + str3 + "]");
        
        /*참보형 변수는 Stack 메모리 영역에는 해당 변수의 실제 값 그리고 추가적인 정보가 들어있는 heap 영역 공간을 향하는
         * 메모리 주소값을 가지게 된다.
         * 그래서 우리가 String객체에 "가나다라" 라는 4개의 글자를 넣고
         * 그리고 우리가 String 객체를 비교하겠다라는건 그글자들이 일치하는지를 비교하겠다 라는 의미가된다. 
         * 
         * 하지만 우리가 저장되어있는 문자들이 일치하는지 비교하기 위해
         * 비교연산자 == 을 사용하ㅔ 되면 문제가 생기게 된다.
         * 
         * 비교연산자는 참조형이라는 데이터타입이 나오기 전부터 존재하던 개념이기 때문에
         * 참조형 변수에 저장되어 있는 주소값을 따라가서 heap 영역의 해당 공간을 찾아 들어가
         * 실제 값이 무엇인지 비교하는 기능이 없다.
         * 
         * 대신 비교연산자는 stack영역에 저장되어있는 값을 기준으로 해서 비교를 실행하게 된다.
         * 그렇기 때문에 위의 비교연산자를 통한 str1과 str2, str1과 str3,str2와 str3 비교를 실행하면
         * 주소값이 일치하는 str2와 str3를 제외하고서는 모두 == 연산자의 결과가 false가 나오게된다.
         * 
         * 내생각대로 풀이법  => str1의 주소값이 "가"번지라고하고 str2의 주소값이 "A"번지라고 한다면 str1과 str2가 다르다.
         *하지만 str3은 str2라고 하였으니 주소값도 "A"번지가 될테니 str2와 str3의 주소값은 같다.
         */
         
        //그럼 str1과 str2,str1과 str3,str2와 str3을 비교연산자를 사용해서 비교해보자
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println("str2 == str3 : " + (str2 == str3));
        
        
        /*
         *하지만 우리가 정말로 비교하고 싶은건 주소값이 아니라
         * 해당 객체의 실제 값을 비교하여 모든 글자가 같으면 true, 만약 한글자라도 다르면 false를 확인하고 싶은 것이다.
         * 
         * 따라서, 우리가 객체의 실제값 비교를 위해서는
         * 비교연산자가 아닌, 객체의 equals()메소드를 통한 비교를 해야한다.
         * 
         * 객체의 equals() 메소드를 실행할 때에는 다음과 같이 적어준다.
         * 객체.equals(비교대상);
         */
        
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str2.equals(str3): " + str2.equals(str3));
    }
   

}
