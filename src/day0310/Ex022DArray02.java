package day0310;

/*구구단을 int 2차원 배열에 값을 넣고
 * 출력하시오
 * 
 */
public class Ex022DArray02 {
public static void main(String[] args) {
    //구구단은 2~9단까지
    //8개의 배열이 모여있는 2차원 배열이다.
    //그리고 각 배열은 1~9까지 곱한수가 저장되는 9칸짜리 배열이다.
  
    int[][] gugudan = new int[8][9];
    
    System.out.println("gugudan.length : " + gugudan.length);
    
    for(int i =0; i< gugudan.length; i++) {
        //구구단의 i번째 요소 = 배열
        //그럼 gugudan[i].length하면 i번째 엘리먼트의 크기가 나오게된다.
        for(int j=0; j < gugudan[i].length; j++)
           //gugudan[i][j]라고 하면
            //gugudan의 i번째 배열의 j번째 칸을 가르키게 된다.
            //그러면 우리가 거기에
            //i *j를 넣어주면? 안된다!!!
            //i : 0~7
            //j : 0~8
            
            //그렇기 때문에 해당 칸에 (i+2) * (j+1)한 결과값을 넣어야한다.
            gugudan[i][j] = (i+2) * (j+1);
        
        }

    for(int i =0; i< gugudan.length; i++) {
        System.out.println();
        System.out.println("----------------------------");
        System.out.println((i+2)+ "단");
        for(int j=0; j< gugudan[i].length; j++) {
            System.out.printf("%d * %d = %2d \n", i+2 ,j+1, gugudan[i][j]);
        }
        System.out.println("----------------------------");
    }
}
}
