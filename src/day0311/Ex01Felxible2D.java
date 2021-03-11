package day0311;

/*가변길이 2차원 배열
*가변 길이 배열이란 배열의 크기를 코드단계에서 고정시키는게 아니라
*변수를 통하여 사용자에게 입력을 받는 다는 식의 형식으로 변수의 값으로 배열의 크기를 정하는 것을
*가변길이 배열이라고 한다.
*하지만 2차원 배열의 경우,
*말 그대로 "배열 데이터타입을 모아놓은 배열"이므로
*2차원 배열안의 배열의 크기는 다 똑같지 않아도 된다.
*
*2차원 가변길이 배열의 선언 방법은 다음과 같다.
*데이터타입[][] 배열이름 = new 데이터타입[크기][];
*단, 2차원 배열 속의 배열안에 값을 넣어줄때에는
*반드시 
*배열이름[인덱스] =new 데이터타입[크기];
*을 통해 배열의 초기화를 해주어야한다.
*/
public class Ex01Felxible2D {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int[][] array = new int[3][];
        array[0] = new int[4];
        array[1] = new int[6];
        array[2] = new int[3];
        
        
        
    }

}
