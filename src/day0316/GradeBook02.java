package day0316;

import java.util.Scanner;

import day0316.Student;
import util.ArrayUtil;
import util.ScannerUtil;

/* 캡슐화가 적용된 Student 클래스를 사용하여
 * 학생 5명을 관리하고
 * 만약 똑같은 이름과 번호를 가진 학생은 또다시 입력할 수 없는
 * 성적 관리 프로그램을 작성하시오.
 */
public class GradeBook02 {
    private static final int SIZE_STUDENT = 5;
    private static final int SCORE_MIN = 0;
    private static final int SCORE_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] arr = new Student[0];
        
        while(true) {
            String message = new String("1.입력  2. 출력 3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, message,1,3);
            
            if(userChoice ==1) {
                if(ArrayUtil.size(arr) < SIZE_STUDENT) {
                    Student s = new Student();
                    
                    s.setId(ScannerUtil.nextInt(scanner, "번호 : "));
                    s.setName(ScannerUtil.nextLine(scanner, "이름 : "));
                    
                    while(ArrayUtil.contains(arr, s)) {
                        System.out.println("이미 존재하는 학생입니다.");
                        System.out.println("다른 학생을 입력해 주세요.");
                        s.setId(ScannerUtil.nextInt(scanner, "번호 : "));
                        s.setName(ScannerUtil.nextLine(scanner, "이름 : "));
                    }
                    
                    s.setKorean(ScannerUtil.nextInt(scanner, "국어 : ",SCORE_MIN,SCORE_MAX));
                    s.setEnglish(ScannerUtil.nextInt(scanner, "영어 : ",SCORE_MIN,SCORE_MAX));
                    s.setMath(ScannerUtil.nextInt(scanner, "수학 : ",SCORE_MIN,SCORE_MAX));
                    
                    arr =ArrayUtil.add(arr, s);
                }else {
                    System.out.println("더이상 입력하실수 없습니다.");
                }
                
            }else if(userChoice ==2) {
                if (ArrayUtil.size(arr) == 0) {
                    System.out.println("아직 입력된 학생 정보가 존재 하지 않습니다.");
                }else {
                    for (int i = 0; i < ArrayUtil.size(arr); i++) {
                        System.out.println();
                        System.out.println("===================");
                        arr[i].showInfo();
                        System.out.println("===================");
                    }
                    System.out.println();
                }
            }else if(userChoice ==3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
     scanner.close();   
    }
    }
