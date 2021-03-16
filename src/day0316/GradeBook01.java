package day0316;

import java.util.Scanner;

import day0315.Student;
import util.ScannerUtil;
import util.ArrayUtil;

/* 사용자로부터 학생의 정보를 입력 받아서
 * 관리하는 프로그램
 * 단, 5명을 초과해서 관리 할 수 없고,
 * 입력시에, 만약 존재하는 학생이면 다시 번호와 이름을 입력 받는다.
 */
public class GradeBook01 {
    static final int SIZE_STUDENT = 5;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] arr = new Student[0];


        while (true) {
            String message = new String("1.입력  2. 출력 3. 종료");

            int userChoice = ScannerUtil.nextInt(scanner, message,1,3);

            if (userChoice == 1) {
                if (ArrayUtil.size(arr) < SIZE_STUDENT) {

                    Student s = new Student();
                    // 번호와 이름을 입력 받는다.
                    message = new String("번호를 입력해주세요 : ");
                    s.id = ScannerUtil.nextInt(scanner, message);
                    message = new String("이름을 입력해주세요 : ");
                    s.name = ScannerUtil.nextLine(scanner, message);

                    // arr에 입력한 값 s가 이미 있다면 오류 메세지 후 다시 입력받는다.
                    while (ArrayUtil.contains(arr, s)) {
                        System.out.println("이미 존재하는 학생입니다.");
                        System.out.println("번호와 이름이 다른 학생을 입력해 주세요.");

                        message = new String("번호를 입력해주세요 : ");
                        s.id = ScannerUtil.nextInt(scanner, message);
                        message = new String("이름을 입력해주세요 : ");
                        s.name = ScannerUtil.nextLine(scanner, message);
                    }

                    message = new String("국어 점수를 입력해주세요 : ");
                    s.korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

                    message = new String("영어 점수를 입력해주세요 : ");
                    s.english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

                    message = new String("수학 점수를 입력해주세요 : ");
                    s.math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

                    // 번호, 이름, 국어, 영어, 수학 점수를 받은 s를 Student 배열인 arr에 넣는다.
                    arr = ArrayUtil.add(arr, s);

                } else {
                    System.out.println("더이상 입력하실수 없습니다.");
                }
            } else if (userChoice == 2) {
                if (ArrayUtil.size(arr) == 0) {
                    System.out.println("아직 입력된 학생 정보가 존재 하지 않습니다.");
                } else {
                    for (int i = 0; i < ArrayUtil.size(arr); i++) {
                        System.out.println();
                        System.out.println("===========================");
                        arr[i].showInfo();
                        System.out.println();
                        System.out.println("===========================");
                    }
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }
        scanner.close();
    }

}
