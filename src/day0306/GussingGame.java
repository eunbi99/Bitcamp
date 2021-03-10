package day0306;

/*숫자 맞추기 게임
 * 
 * 1.플레이 기능
 *   플레이 기능에서는 컴퓨터가 1~100사이의 랜덤한 숫자를 하나 뽑고
 *   사용자가 그 숫자를 맞추는 기능이 구현되어있다.
 *   사용자가 컴퓨터가 뽑은 숫자를 맞출 때까지 계속 입력을 하되
 *   사용자의 숫자가 더 클 경우 Down이라는 메세지 출력,
 *   사용자의 숫자가 더 작을 경우 Up이라는 메세지 출력.
 *   사용자가 입력하는 숫자는 1-100을 벗어날수없다,
 *   또한 사용자가 입력할때마다 점수가 나오고
 *   해당 점수가 최고기록보다 작으면, 그점수가 새로운 최고 기록이 된다.
 *   
 *   2.최고기록 보기 기능
 *     현재까지 플레이한 기록중 가장 최고 기록을 보여준다
 *     단,사용자가 플레이 했던 기록이 없을 경우, "아직 플레이한 기록이 없습니다" 라는 간단한 메시지 출력
 *     
 *   3. 종료 기능
 *      프로그램 종료시킨다.
 */
import java.util.Random;
import java.util.Scanner;

public class GussingGame {
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //최고점수를 저장할 변수
        int bestScore = 0;
        
        while (true) {
            System.out.println("1.플레이기능");
            System.out.println("2.최고기록 보기 기능");
            System.out.println("3.종료기능");
            System.out.println(">");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                // 플레이 코드 구현
                // 현재 점수 변수 선언
                int currentScore = 0;
                // 1.컴퓨터 숫자 결정
                int computerNumber = random.nextInt(NUMBER_MAX) + 1;

                // 2.사용자의 입력
                // A.숫자 입력
                System.out.println("1~100까지번호를 입력해주세요 : ");
                int inputNum = scanner.nextInt();

                while (!(inputNum >= NUMBER_MIN && inputNum <= NUMBER_MAX)) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("1~100까지번호를 입력해주세요");
                    inputNum = scanner.nextInt();
                }
                currentScore++;

                // B.컴퓨터 숫자와 같을 때까지 입력
                while (computerNumber != inputNum) {
                    // 컴퓨터 숫자와 사용자의 숫자를 비교해서
                    // UP 혹은 DOWN 둘 중 하나를 출력해준다.
                    if (inputNum > computerNumber) {
                        System.out.println("Down");
                    } else {
                        System.out.println("Up");
                    }
                    System.out.println("1~100까지번호를 입력해주세요 : ");
                    inputNum = scanner.nextInt();

                    while (!(inputNum >= NUMBER_MIN && inputNum <= NUMBER_MAX)) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println("1~100까지번호를 입력해주세요");
                        inputNum = scanner.nextInt();
                    }

                    currentScore++;
                }
                // 3.이번 판 결과 출력
                // A.축하메시지
                System.out.println("짝짝짝 정답입니다!!!");
                // B.현재 점수 출력
                System.out.println("사용자의 이번 라운드 기록 :" +currentScore);
                // C.최고 기록 출력
                if(bestScore != 0) {
                    System.out.println("현재 최고 기록 : "+ bestScore);
                }
                // D.최고 기록 결정
                if (currentScore < bestScore || bestScore ==0) {
                    System.out.println("짝짝짝 새로운 최고기록을 달성했습니다.");
                    bestScore = currentScore;

                }

            } else if (userChoice == 2) {
                if (bestScore > 0) {
                    System.out.println();
                    System.out.println("최고기록은 : " + bestScore + "회 입니다.");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("아직 플레이 기록이 없습니다.");
                    System.out.println();
                }

            } else if (userChoice == 3) {
                System.out.println("게임을 종료합니다.");
                break;
            }

          
        }
        scanner.close();

    }

}
