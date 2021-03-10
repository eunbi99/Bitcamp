package day0309;
/* 로또 게임 2번
 * 1-45의 랜덤한 숫자를 크기가 6인 배열에 넣어주고 출력해주는 프로그램
 * 중복제거 알고리즘 추가
 */ 

import java.util.Random;
public class LottoGame02 {
    static final int SIZE =6;
    static final int NUMBER_MAX =45;
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("로또 게임 ver 0.2");
        
        //[]는 배열이라는 데이터 타입을 말하는 것이다.
        //즉 아래의 선언식의 경우
        //"int 가 모여있는 int 배열 lottoNumbers를 선언하고 그리고 해당 배열의 크기(=길이)는 size이다." 라는 의미이다.
        /*element vs index
         * element는 배열 안의 각각의 구성원을 우리가 element라고 한다.
         * 일반적인 변수의 경우, 우리가 그 변수의 이름을 알고 있기 때문에
         * 그 이름의 경우 우리는 그 변수의 이름을 모른다.
         * 
         * 그대신, 배열의 각 칸에는 해당 엘리먼트에 대한 주소값이 저장되어있다.
         * 따라서 우리가 해당 엘리먼트에 접근 할 때에는 (=값을 할당하거나 호출할때에는)
         * 이름대신 배열의 해당 칸에 저장되어있는 주소값을 이용해서 접근하게 되는 것이다.
         * 그때 , 우리가 배열의 몇번째 칸에 접근할 것인지를 적어야 하는데
         * 그 몇번째 인지를 우리가 인덱스라고 부르는 것이다.
         */
        int[] lottoNumbers = new int[SIZE];
        
        //아래의 for문은 우리가
        //lottoNumbers 배열의 i번째 인덱스마다
        //random.nextInt(NUMBER_MAX)+1 한 값을 할당해주는 FOR문
        for(int i=0; i<lottoNumbers.length; i++) {
            /*lottoNumbers의 i번째 칸에 저장되어있는 주소값을 타고가서
             * 그 공간에 random.nextInt(NUMBER_MAX) +1 한 결과값을
             * 할당해라 라는 의미이다.
             */
            lottoNumbers[i]=random.nextInt(NUMBER_MAX)+1;
        }
        
        System.out.println();
        System.out.println("중복제거전");
        System.out.println();
        
        /*아래의 for문은 우리가 
         * lottoNumbers 배열의 i번째 인덱스에 저장되어있는 값을 호출해서
         * 화면에 출력하는 for문이다.
         */
        for(int i=0; i<lottoNumbers.length; i++) {
            /*아래에서 lottoNumbers[i]라고 적어주는데 이때는
             * lottoNumbers 배열의 i번째 칸의 저장된 주소값을 타고 들어가서
             * 그 공간에 저장되어 있는 int값을 불러오는것이다.
             */
            System.out.printf("lottoNumbers[%d] : [%2d]\n ",i,lottoNumbers[i]);
        }

        System.out.println("---------------------------------------------------");
        //중복 제거용 2중 for문
        //i와 j가 다르지만
        //lottoNumbers[i]와 lottoNumbers[j]가 같다는건 중복이므로
        //lottoNumbers[i]에 새로운 값을 넣어주고 다시 처음부터 검사하게 만들어준다.
        
        //무식한 방법이다.
        //만약 이 방법을 쓸 경우, j for문은 매우 많이 반복 될수도 있다!
        //또한 최소 36번 이상 if조건식을 실행하게 된다.
        
        /*for(int i=0; i<lottoNumbers.length; i++) {
            for(int j =0; j<lottoNumbers.length; j++) {
                if(i != j && lottoNumbers[i] == lottoNumbers[j]) {
                    System.out.printf("%d 인덱스와 %d 인덱스가 중복이므로 %d에 새로운 값 할당\n",i,j,i);
                    lottoNumbers[i] = random.nextInt(NUMBER_MAX)+1;
                    //j를 -1로 초기화한후에 
                    j=-1;
                    //for문의 j++가 실행되면 0이되어 다시 앞으로 간다.
                    
                }
            }
        }
        */
        
        //2.좀더 나은방식
        /*우리가 랜덤 숫자를 하나 뽑아서
         * 그 숫자가 우리 배열에 존재하는지 체크하여
         * 존재하지않을 때에만 배열에 넣어준다.
         * 
         * 어디 위치에 추가할지 정하는 int idx
         */
        int idx =0;
        
        while(idx < lottoNumbers.length) {
            //새로 추가해줄 숫자
            //랜덤 객체를 사용해서 1~45 사이의 랜덤 숫자를 하나 뽑아서
            //randomNumber 변수에 할당한다.
            int randomNumber =random.nextInt(NUMBER_MAX)+1;
            //randomNumber가 우리의 int배열인 lottoNumbers에 이미 존재하는 숫자일 때
            //값이 false로 바뀔 boolean 변수 numberChecker
            //중복된 숫자일 경우, FALSE로 바뀌는 Boolean변수
            boolean numberChecker =true;
            
            //아래의 for문은 우리가 lottoNumbers의 i번째 저장된 값과
            //randomNumber와 같은지 체크하여
            //같을 시에는 numberChecker의 값을 false로 바꾸고 break한다.
            
            for(int i=0; i< lottoNumbers.length; i++) {
                if(randomNumber == lottoNumbers[i]) {
                    //같기때문에 true가 false로 바뀌고 for문을 빠져나온다.
                    //그리고 다시 while문으로 들어가서 새로운 랜덤값을 뽑는다.
                    numberChecker=false;
                    break;
                }
            }
            //numberChecker가 true일때 -> 중복이 아닐때
            //randomNumber을 lottoNumber 배열변수의  idx번 칸에
            //ramdomNumber의 현재값을 할당하겠다.
            //그리고 idx를 ++해주고 다시 while문으로 돌아간다.
            if(numberChecker) {
                
                lottoNumbers[idx] = randomNumber;
                idx++;
            }
        }
        
        System.out.println();
        System.out.println("중복제거후");
        System.out.println();
        
        for(int i=0; i<lottoNumbers.length; i++) {
            System.out.printf("lottoNumbers[%d] : [%2d]\n ",i,lottoNumbers[i]);
        }

    }
}
