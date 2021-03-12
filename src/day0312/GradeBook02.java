package day0312;

import java.util.Scanner;
import util.ScannerUtil;
/*입력과 출력을 메소드로 분리해서
 * 6명의 학생을 관리하는 프로그램을 작성하시오,
 */
public class GradeBook02 {
    static final int SIZE_SUBJECT=3;
    static final int SIZE_STUDENT=6;
    static final int SCORE_MIN=0;
    static final int SCORE_MAX=100;
    static final int INDEX_KOREAN =0;
    static final int INDEX_ENGLISH =1;
    static final int INDEX_MATH =2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //번호배열
        int[] idArray = new int[SIZE_STUDENT];
        //이름 배열 
        String[] nameArray = new String[SIZE_STUDENT];
        //점수 배열
        int[][] scoreArray = new int[SIZE_STUDENT][SIZE_SUBJECT];
        //현재 입력할 인덱스
        
        int index=0;
        
        while(true) {
            System.out.println();
           System.out.println("1.입력 2.출력 3.종료");
           System.out.println();
           
           int userChoice = scanner.nextInt();
           
           if(userChoice == 1) {
               if(index < SIZE_STUDENT) {
                   insert(scanner,index,idArray,nameArray, scoreArray);
                   index++;
               }else {
                   System.out.println("더이상 입력하실수 없습니다.");
               }
           }else if(userChoice ==2 ) {
               if(index>0) {
                   print(index,idArray ,nameArray, scoreArray );
               }else {
                   System.out.println("입력된 값이 없습니다.");
               }
               
           }else if(userChoice ==3) {
               System.out.println("사용해 주셔서 감사합니다.");
               break;
           }
            
        }
        scanner.close();
    }
    
    public static void insert(Scanner scanner, int index , int[] idArray , String[] nameArray, int[][] scoreArray) {
        idArray[index] = ScannerUtil.nextInt(scanner, "번호를 입력해주세요");
        nameArray[index]= ScannerUtil.nextLine(scanner,"이름을 입력하세요");
        scoreArray[index][INDEX_KOREAN] = ScannerUtil.nextInt(scanner, "국어점수를 입력해주세요",SCORE_MIN,SCORE_MAX);
        scoreArray[index][INDEX_ENGLISH] =ScannerUtil.nextInt(scanner, "영어점수를 입력해주세요",SCORE_MIN,SCORE_MAX);
        scoreArray[index][INDEX_MATH] =ScannerUtil.nextInt(scanner, "수학점수를 입력해주세요",SCORE_MIN,SCORE_MAX);
        index++;
    }
    
    public static void print(int index , int[] idArray , String[] nameArray, int[][] scoreArray ) {
        for(int i =0; i < index; i++) {
            System.out.println("======================================================");
            System.out.printf("번호 : %03d번 이름 : %s\n",idArray[i],nameArray[i]);
            System.out.printf("국어 : %03d점 영어 : %03d점  수학 : %03d점 \n ",
                    scoreArray[i][INDEX_KOREAN],scoreArray[i][INDEX_ENGLISH],scoreArray[i][INDEX_MATH]);
            int sum= scoreArray[i][INDEX_KOREAN] + scoreArray[i][INDEX_ENGLISH] + scoreArray[i][INDEX_MATH];
            double average =(double)sum /SIZE_SUBJECT;
                    System.out.printf("총점 : %03d점 평균 : %06.2f점 \n", sum, average);
        }
    }
}
