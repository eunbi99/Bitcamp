package day0315;
/* 객체를 사용한 성적관리 프로그램
 * 단, 지금 당장은 한명의 정보만 입력하고 출력해보자
 * 
 */
import java.util.Scanner;

import util.ScannerUtil;
public class GradeBook02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 정보를 저장할 Student 객체를 선언과 초기화
        Student s = new Student();
        //객체의 필드 혹은 메소드를 접근 할때에는
        //객체. 으로 접근하게 된다.
        // 그래서 "." 을 자바에서는 접근 연산자라고도 부른다.
        s.id=ScannerUtil.nextInt(scanner, "번호를 입력해주세요");
        s.name=ScannerUtil.nextLine(scanner, "이름을 입력해주세요");
        s.korean=ScannerUtil.nextInt(scanner, "국어 점수를 입력해주세요");
        s.english=ScannerUtil.nextInt(scanner, "영어점수를 입력해주세요");
        s.math=ScannerUtil.nextInt(scanner, "수학점수를 입력해주세요");
        
        //정보를 출력해줄때에는 별 다른거 할 거 없이
        //그냥 Student 클래스의 객체인 s의 showInfo()만 실핼해주면 된다.
        s.showInfo();
        
        scanner.close();
}
}
