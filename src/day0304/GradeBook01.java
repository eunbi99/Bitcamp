package day0304;
/*
 * 직접 변수를 만들고 다음과 같은 형식을 갖추어 출력될 수 있게 프로그램을 작성하세요
 * 번호 : 0##번 이름 : ###
 * 국어 :0##점 영어 : 0##점 수학 :0##점
 * 총점 : 0##점 평균 ㅣ 0##.##점
 */
public class GradeBook01 {
    public static void main(String[] args) {
    int num = 13;
    String name ="김은비";
    int kor =97;
    int eng =77;
    int math=88;
    int sum =kor + eng + math ;
    double avg = sum /3.0;
    
    System.out.printf("번호 : %03d번 이름 :%s \n", num, name);
    System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점 \n",kor, eng, math);
    System.out.printf("총점 : %03d점 평균 : %06.2f점", sum,avg);
           
    
    }
}
