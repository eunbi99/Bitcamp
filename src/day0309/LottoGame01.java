package day0309;
/* 로또 게임 1번
 * 1-45의 랜덤한 숫자를 크기가 6인 배열에 넣어주고 출력해주는 프로그램
 */

import java.util.Random;
public class LottoGame01 {
    static final int SIZE =6;
    static final int NUMBER_MAX =45;
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("로또 게임 ver 0.1");
        
        //크기가 6인 배열 선언
        int[] lottoNumbers = new int[SIZE];
        
        /*For문을 사용해서
         * lottoNumbers배열에 각 위치에 random.nextInt(NUMBER_MAX)+1 한 값을 넣어서
         * 랜덤한 숫자를 넣어주자
         * 
         * 배열의 크기는 우리가 배열.length로도 크기를 알수있다.
         */
        for(int i=0; i<lottoNumbers.length; i++) {
            lottoNumbers[i]=random.nextInt(NUMBER_MAX)+1;
        }
        
        //for문을 사용하여 lottoNumbers.length 배열의 전체 내용을 출력해보자
        for(int i=0; i<lottoNumbers.length; i++) {
            System.out.printf("lottoNumbers[%d] : [%2d]\n ",i,lottoNumbers[i]);
        }
        //0.1버젼의 문제점
        //1. 중복된 숫자가 나온다.
        //2. 정렬이 안되어있다.
    }
}
