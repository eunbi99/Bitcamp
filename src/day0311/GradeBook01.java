package day0311;
/* 사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 입력받아서
 * 예쁘게 출력하는 프로그램을 만드시오
 * 해당 프로그램은 총 6명의 학생의 정보를 입력할수 있습니다.
 * 
 * 단, 국어 영어 수학 점수는 2차원 배열을 사용하여
 * 묶어서 관리가 가능하게 만드시오.
 */

import java.util.Scanner;
public class GradeBook01 {
    static final int STUDENT_SIZE=6;
    static final int SUBJECT_SIZE=3;
    static final int SCORE_MAX=100;
    static final int SCORE_MIN=0;
    static final int INDEX_KOREAN =0;
    static final int INDEX_ENGLISH=1;
    static final int INDEX_MATH=2;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //번호를 담당하는 배열
        int[] idArray = new int[STUDENT_SIZE];
        //이름을 담당하는 배열
        String[] nameArray = new String[STUDENT_SIZE];
        //점수를 담당하는 2차원 배열
        //각 배열안에 배열이 실제 점수를 저장하는 용도가 된다.
        //->[학생이름의][첫번째는 국어점수, 두번째는 영어점수, 세번째는 수학점수]
        int[][] scoreArray = new int[STUDENT_SIZE][SUBJECT_SIZE];
        
        int index=0;
        
        while(true) {
            System.out.println("1.입력 2. 출력 3.종료");
            int userChoice= scanner.nextInt();
            
            if(userChoice==1) {
                if (index < STUDENT_SIZE) {
                    //정보입력하기
                    System.out.println("번호를 입력해주세요.");
                    idArray[index] = scanner.nextInt();          
                    
                    scanner.nextLine();
                    System.out.println("이름을 입력해주세요");
                    nameArray[index] = new String(scanner.nextLine());
                    
                    
                    scanner.nextLine();
                    System.out.println("국어점수를 입력해주세요 : ");
                    scoreArray[index][INDEX_KOREAN] = scanner.nextInt();
                    
                    
                    scanner.nextLine();
                    System.out.println("영어점수를 입력해주세요");
                    scoreArray[index][INDEX_ENGLISH] = scanner.nextInt();
                    
                    
                    scanner.nextLine();
                    System.out.println("수학점수를 입력해주세요");
                    scoreArray[index][INDEX_MATH] = scanner.nextInt();
                    
                    index++;
    
                
                }else {
                    System.out.println("입력하실수 없습니다.");
                }
                
            }else if(userChoice ==2) {
                if(index >0) {
                    //정보 출력하기
                    for(int i =0; i < index; i++) {
                        System.out.println("======================================================");
                        System.out.printf("번호 : %03d번 이름 : %s\n",idArray[i],nameArray[i]);
                        System.out.printf("국어 : %03d점 영어 : %03d점  수학 : %03d점 \n ",
                                scoreArray[i][INDEX_KOREAN],scoreArray[i][INDEX_ENGLISH],scoreArray[i][INDEX_MATH]);
                        int sum= scoreArray[i][INDEX_KOREAN] + scoreArray[i][INDEX_ENGLISH] + scoreArray[i][INDEX_MATH];
                        double average =(double)sum /SUBJECT_SIZE;
                                System.out.printf("총점 : %03d점 평균 : %06.2f점 \n", sum, average);
                    }
                }else {
                    System.out.println("아직입력된 정보가 존재하지 않습니다.");
                   
               }
            }else if(userChoice ==3) {
            System.out.println("사용해주셔서 감사합니다.");
            break;
        }
    }

    scanner.close();
    }
}
