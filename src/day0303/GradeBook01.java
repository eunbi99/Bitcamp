package day0303;
//여러분들이 직접 변수를 만들어서 다음과 같은 형태로 출력이 될수있게 
//프로그램을 작성해보세요 (10분)

//번호 : #번
//이름: ###
//국어 ##점
//영어: ##점
/*수학 :##점
 * 총점 : ##점 
 *평균 ##.####점
 */

public class GradeBook01 {
    public static void main(String[] args) {
        
    int num = 10;
    String name = "김은비";
    int kor = 100;
    int eng =80;
    int math =75;
    int sum = kor+eng+math;
    double avg = sum/3.0;
    
    System.out.println("번호 : " + num + "번");
    System.out.println("이름 : " + name);
    System.out.println("국어 : " + kor + "점");
    System.out.println("영어 : " + eng + "점");
    System.out.println("수학 : " + math + "점");
    System.out.println("총점 : " + sum + "점");
    System.out.println("평균 : " + avg + "점");

    }

}
