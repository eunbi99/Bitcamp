package day0310;

import java.util.Scanner;

public class GradeBook01Answer {
    static final int STUDENT_SIZE = 5;
    static final int SUBJECT_SIZE = 3;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        // 정보를 담을 배열들을 만들어준다

        // 번호를 담을 idArray
        int[] idArray = new int[STUDENT_SIZE];
        // 이름을 담을 nameArray
        String[] nameArray = new String[STUDENT_SIZE];
        // 국어점수를 담을 korArray
        int[] korArray = new int[SUBJECT_SIZE];
        int[] engArray = new int[SUBJECT_SIZE];
        int[] mathArray = new int[SUBJECT_SIZE];

        // 지금 현재 입력할 인덱스를 저장한 int idx
        int idx = 0;

        while (true) {
            System.out.println();
            System.out.println("1.입력 2.출력 3.종료");
            System.out.println();
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                // idx 칸에 각 정보를 입력한다.

                // 먼저 우리가 5명 미만을 입력했을 경우
                // idx칸에 입력한다.

                // 만약 우리가 5명을 입력했으면 더이상
                // 입력이 안되게 막는다.
                if (idx < STUDENT_SIZE) {
                    // 아직 5명 미만이 입력됐으므로
                    // 입력가능.
                    // 번호입력
                    System.out.println("번호를 입력해주세요 : ");
                    idArray[idx] = scanner.nextInt();

                    // 이름입력
                    scanner.nextLine();
                    System.out.println("이름을 입력해주세요 : ");
                    nameArray[idx] = new String(scanner.nextLine());

                    // 국어입력
                    System.out.println("국어점수를 입력해주세요 : ");
                    korArray[idx] = scanner.nextInt();

                    // 국어입력 검증
                    while (!(korArray[idx] >= SCORE_MIN && korArray[idx] <= SCORE_MAX)) {
                        System.out.println("잘못입력하셨습니다.");
                        System.out.println("국어점수를 입력해주세요 : ");
                        korArray[idx] = scanner.nextInt();
                    }

                    // 영어점수 입력
                    System.out.println("영어점수를 입력해주세요 : ");
                    engArray[idx] = scanner.nextInt();

                    // 영어점수 검증
                    while (!(engArray[idx] >= SCORE_MIN && engArray[idx] <= SCORE_MAX)) {
                        System.out.println("잘못입력하셨습니다.");
                        System.out.println("영어점수를 입력해주세요 : ");
                        engArray[idx] = scanner.nextInt();
                    }

                    // 수학점수 입력
                    System.out.println("수학점수를 입력해주세요 : ");
                    mathArray[idx] = scanner.nextInt();

                    // 수학점수 검증
                    while (!(mathArray[idx] >= SCORE_MIN && mathArray[idx] <= SCORE_MAX)) {
                        System.out.println("잘못입력하셨습니다.");
                        System.out.println("수학점수를 입력해주세요 : ");
                        mathArray[idx] = scanner.nextInt();
                    }

                    idx++;

                } else {
                    // 이미 우리가 5명을 입력했으므로
                    // 더이상 입력할 수 없다만 알려준다.

                    System.out.println("더이상 입력할 수 없습니다!!!");

                }

            } else if (userChoice == 2) {
                // 배열의 내용을 출력한다.
                if (idx > 0) {
                    // idx가 0보다 크다라는 것은
                    // 현재 입력할 인덱스가 0보다 크다.
                    // 즉, 1명이상이 입력되어있다는 뜻이된다.

                    // 그럴 경우에는 0번 idx부터 idx보다 작을때까지 i for문을 사용하여
                    // 내용을 출력해주면 된다.
                    for (int i = 0; i < idx; i++) {
                        System.out.println();
                        System.out.println("========" + nameArray[i] + "번 학생의 정보========");

                        System.out.printf("번호 : %d번 이름 : %s \n ", idArray[i], nameArray[i]);
                        System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점 \n", korArray[i], engArray[i],
                                mathArray[i]);
                        int sum = korArray[i] + engArray[i] + mathArray[i];
                        double average = (double) sum / SUBJECT_SIZE;
                        System.out.printf("총점 : %03d점 평균 %06.2f점 \n", sum, average);
                        System.out.println("=================================");
                        System.out.println();
                    }
                } else {
                    System.out.println();
                    System.out.println("아직 입력된 학생이 존재하지 않습니다.");
                    System.out.println();
                }
            } else if (userChoice == 3) {
                // 메시지 출력후 종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }

        scanner.close();
    }

}
