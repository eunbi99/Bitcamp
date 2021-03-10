package day0308;

import java.util.Scanner;
    public class Star09 {
        public static void main(String[] args) {
           // TODO Auto-generated method stub
            Scanner scanner = new Scanner(System.in);
            System.out.println("출력할 줄 수를 입력해주세요");
            int userNumber= scanner.nextInt();
            
            for(int i=1;i<=2 * userNumber-1 ;i++) {
                String stars = new String();
                
                if(i<userNumber) {
                    //윗부분
                    
                    //공백을 담당하는 j for문
                    /*ex)userNumber이 5일경우
                     * 첫 공백은 4개이다.
                     * j가 1일경우 --> userNumber(5)-i(1)=4(공백)
                     * j가 2일경우 --> userNumber(5)-i(2)=3(공백)
                     * ..이런식으로 공백이 생성.
                     */
                    for(int j=1; j<=userNumber -i; j++) {
                        stars+= " ";
                    }
                    //별을 담당하는 j for문
                    /*j가 1일경우 j(1) <=(2 *1)-1=1(별)
                     *j가 2일경우 j(2) <=(2*2)-1 =3(별)
                     *... 이런식으로 j(5) <=(2*5)-1=9 (별)로 
                     *윗부분 5줄이 별 9개로 완성된다.
                     *
                     */
                    for(int j =1; j<=2 * i-1; j++) {
                        stars+="*";
                    }
                    //else는 i가 userNumber보다 큰 경우
                }else {
                    //아랫부분
                    //아랫부분의 j for문에서 사용할 lowerI
                    int lowerI =2 * userNumber -i;
                    
                    //공백을 담당하는 j for문
                    for(int j =1; j<=userNumber -lowerI; j++) {
                    //         1  1<= 5 - (2*5)-6=1
                            // 2  2<=5- (2*5)-7=2
                            // 3  3<=5 -(2*5)-8=3
                            // 4  4<=5 -(2*5)-9=4
                            // 5  5<=5-(2*5)-10=5
                        stars +=" ";
                    }
                    
                    //별을 담당하는 j for문
                    for(int j=1; j<=2 * lowerI - 1;j++) {
                        //    1  1<=(2 * (2*5)-6) -1 =7 
                       //     2  2<=(2 * (2*5)-7) -1=5
                       //     3  3<=(2 * (2*5) -8) -1 =3
                       //     4  4<=(2 * (2*5) -9) -1 =1
                        stars += "*";
                    }
                    
                }
            
            
//            for(int i=1; i<=userNumber; i++) {
//                String star = new String();
//                star+="*";
//                for(int j=userNumber-2; j>=i-1; j--) {
//                    System.out.printf(" ");
//                }
//                for(int j=1; j<=2*i-1; j++) {
//                   System.out.printf(star);
//                }
//                System.out.println();
//            }
//            for(int i=1; i<=userNumber; i++) {
//                String star = new String();
//                star += "*";
//                for(int j=0; j<=i-1; j++) {
//                    System.out.printf(" ");
//                }   
//                for(int j=2*userNumber -3; j>=2*i-1; j--) {
//                    System.out.printf(star);
//                }
//                System.out.println();
//            }
//            
               System.out.println(stars);     
        }
        scanner.close();
        }
    }