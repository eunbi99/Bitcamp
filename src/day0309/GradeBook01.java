package day0309;
/*학생 관리 프로그램
 * 5명의 학생을 관리하는 프로그램을 작성하시오.
 * 단, 모두 변수로 만드는 것이 아니라
 * 번호 배열, 이름 배열, 국어점수 배열, 영어점수 배열, 수학점수 배열
 * 로 만들어서
 * 각 배열의 같은 인덱스는 같은 학생의 정보가 될 수 있도록 하시오.
 * 또한 메뉴를 만들어
 * 입력, 출력, 종료를 분리하고
 * 입력시에는 0번,1번,2번 ... 순으로 들어갈수있게 만드시오.
 * 입력시에 잘못된 점수는 입력되지 않도록 만들어 주세요.
 * 
 * 심화단계 : 출력시 , 만약 입력 학생이 없으면 "입력된 학생이 없습니다"라고 출력 되고
 * 입력된 학생이 존재 할 시에는 입력된 학생들만 출력되고 아직 입력되지 않은 칸의 정보는 
 * 출력되지 않도록 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class GradeBook01 {
static final int SIZE=5;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int[] student = new int[SIZE];
    int[] number = new int[SIZE];
    String[] name = new String[SIZE];
    int[] kor = new int[SIZE];
    int[] eng = new int[SIZE];
    int[] math = new int[SIZE];
    

     boolean userChecker =false;
     
     //입력
     while(true) {
         System.out.println("|  1.입력   |  |  2.출력    |  |  3.종료    |");
         int userNumber=scanner.nextInt();
         
         if(userNumber==1) {
             
             for(int i=0; i<student.length; i++) {
               System.out.println("-----------학생 등록---------");
                 System.out.println("번호를 입력해주세요 : ");
                 int userNum= scanner.nextInt();
                 
                 number[i] =userNum;
                 
                 
                 System.out.println("이름을 입력해주세요 : ");
                 scanner.nextLine(); 
                 String userName= new String(scanner.nextLine());
                 name[i] = userName;
                 
                 System.out.println("국어점수를 입력해주세요 : ");
                 int userKor= scanner.nextInt();
                 
                 while(!(userKor >=0 && userKor <=100)) {
                     System.out.println("잘못입력하셨습니다.");
                     System.out.println("국어점수를 입력해주세요 : ");
                     userKor= scanner.nextInt();
                 }
                 kor[i]=userKor;
                 
                 
                 System.out.println("영어점수를 입력해주세요 : ");
                 int userEng= scanner.nextInt();
                 
                 while(!(userEng >=0 && userEng <=100)) {
                     System.out.println("잘못입력하셨습니다.");
                     System.out.println("영어점수를 입력해주세요 : ");
                     userEng= scanner.nextInt();
                 }
                 eng[i]=userEng;
                 
                 
                 System.out.println("수학점수를 입력해주세요 : " );
                 int userMath= scanner.nextInt();
                 
                 while(!(userMath >=0 && userMath <=100)) {
                     System.out.println("잘못입력하셨습니다.");
                     System.out.println("수학점수를 입력해주세요 : " );
                     userMath= scanner.nextInt();
                 }
                 
                 math[i]=userMath;
                 
                 
             }
             
             userChecker=true;
             
             
         }else if(userNumber ==2) {
             if(userChecker) {
                 for(int i=0; i<student.length; i++) {
                     System.out.printf("번호 : " + number[i] + "| 이름 : " + name[i] + " |  국어 : " +  kor[i] + " |  영어 :  " + eng[i]  +  "|  수학 :  "+ math[i] + "\n "); 
                 }
             }else {
                 System.out.println("입력된 정보가 없습니다.");
                 break;
             }
         
         }else if(userNumber ==3) {
             System.out.println("사용해주셔서 감사합니다.");
             break;
         }
         
    }
    }  

}

