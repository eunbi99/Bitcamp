package day0305;
/*사용자로부터 번호, 이름,국어,영어,수학을 입력받아
 * 번호 :0##번 이름 :###
 * 국어 :0##점 영어:0##점 수학:0##점
 * 총점 :0##점 평균 : 0##.##점
 * 
 * 단 입력기능과 출력기능을 분리하여
 * 사용자가 입력을 선택했을 때에만 입력을 하게되고
 * 사용자가 출력을 선택했을때에만 츨력을 하게 하는 프로그램을 만드시오
 * 생각해봏것 :변수의 선언위치
 * 또한 사용자가 잘못된 점수를 입력했을경우, 올바른 점수를 입력할때까지 다시 입력을 받도록 하세요
 * 
 * 심화문제 :만약 사용자가 아무런 정보를 입력없이 출력을 누르면
 * "아직 아무런 입력이 되지않았습니다" 라는 메시지만 출력되게 작성.
 */
import java.util.Scanner;
public class GradeBooke01 {
    static final int SUBJECT_SIZE=3;
    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        // TODO Auto-generated method stub
        /*우리가 while문안에 있는
         * if 코드 블락에서 정보를 입력한 것이
         * while이 반복되더라도 남아있게 하기 위해서는
         * while문 이전에 선언과 초기화를 한번씩 다 해주어야 한다

         */
        //사용할 변수의 선언과 초기화
        int num=0;
        String name = new String();
        int kor=0;
        int eng=0;
        int math=0;
        
        //사용자가 한번이라도 입력을 했는지를 저장할 boolean 변수
        boolean inputChecker= false;
        
        //정보입력
        while(true) {
            System.out.println("1.입력 2.출력 3.종료");
            int userChoice = scanner.nextInt();
            
            if(userChoice==1) {
                System.out.printf("번호 :");
                num =scanner.nextInt();
 
                scanner.nextLine(); 
                System.out.print("이름 : ");
                name=scanner.nextLine();
                
                /*임시로 사용자의 점수 입력을 받아서
                 * 올바른 점수인지 체크하여
                 * 올바른 점수이면 각각의 점수에 다시 할당해줄 
                 * int 변수 선언
                 */
                int userInput =0;
                
                //국어 점수 입력
                
                System.out.print("국어 : ");
                userInput = scanner.nextInt();
                
                while(!(userInput >=0 && userInput <=100)) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("국어 : ");
                    userInput=scanner.nextInt();
                    
                }
                
                kor =userInput;
                //수학 점수 입력
                
                System.out.print("수학 : ");
                userInput = scanner.nextInt();   
                
                while(!(userInput >=0 && userInput <=100)) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("수학 : ");
                    userInput=scanner.nextInt();
                    
                }
                
                math = userInput;
           
                //영어 점수 입력
              
                System.out.print("영어 : ");
                userInput = scanner.nextInt();
                
                while(!(userInput >=0 && userInput <=100)) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("영어 : ");
                    userInput=scanner.nextInt();
                    
                }
                
                eng=userInput;
          
                inputChecker = true;
              
            }else if(userChoice==2) {
                
                /*inputChecker의 값을 확인하여
                 * true일 경우에는 사용자가 1번 기능인
                 * 성적 입력을 실행을 한번이라도 했다는 의미이므로 출력을 하고
                 * 만약 false일 경우에는 사용자가 한번이라도 입력을 안했다는 의미가 되므로
                 * 경고 메시지만 출력해주면 된다!!
                 * 
                 * boolean 타입일 경우,
                 * 굳이 비교 연산자를 사용해서
                 * true인지 false인지 비교하지 않아도
                 * 그 자체 안에 저장된 값이 true/false 값이므로
                 * 우리가 아래처럼 조건식에 그 자체를 넣어줄 수 있다.
                 */
                
                if(inputChecker) {
                    int sum=kor+eng+math;
                    double avg=sum/SUBJECT_SIZE;
                    
                    System.out.printf("번호 : %03d번 이름 :%s \n", num, name);
                    System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점 \n",kor, eng, math);
                    System.out.printf("총점 : %03d점 평균 : %06.2f점\n", sum,avg);
                }else {
                    System.out.println("아직 입력된 성적이 존재 하지않습니다.");
                }

                
            }else if(userChoice ==3){
                System.out.println("사용해주셔서 감사합니다.");    
                break;
               }
         
        }
        scanner.close();
    }

}
