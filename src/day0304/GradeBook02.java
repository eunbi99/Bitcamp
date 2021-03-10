package day0304;

import java.util.Scanner;
/*사용자로 부터 
 * 번호, 이름, 국어,영어, 수학 점수를 차례대로 입력받아
 * 다음과 같은 형식으로 출력되는 프로그램
 * 번호 : 0##번 이름: ###
 * 국어 :0##점 영어 : 0##점 수학 : 0##점
 * 총점 : 0##점 평균 : 0##.##점
 */
public class GradeBook02 {
  //프로그램 내부적으로 사용할 상수들
    //1.과목의 숫자
    static final int SUBJECT_SIZE =3;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // TODO Auto-generated method stub
        
        //정보입력
        System.out.printf("번호 :");
        int num =scanner.nextInt();
       
        
        System.out.print("이름 : ");
        scanner.nextLine(); 
        String name= new String(scanner.nextLine());
        
        
        System.out.print("국어 : ");
        int kor = scanner.nextInt();
        
        
        System.out.print("수학 : ");
        int math = scanner.nextInt();
        
        
        System.out.print("영어 : ");
        int eng = scanner.nextInt();
        
        //총점 평균 계산
        int sum = eng+math+kor;
        double avg=sum/(double)SUBJECT_SIZE;
        
        //값 출력
        System.out.printf("번호 : %03d번 이름 :%s \n", num, name);
        System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점 \n",kor, eng, math);
        System.out.printf("총점 : %03d점 평균 : %06.2f점", sum,avg);
        scanner.close();
        
        

    }

}
