package day0306;

import java.util.Random;
import java.util.Scanner;
public class RSPGameAnswer {
    static final int OPTION_SIZE =3;
    static final int OPTION_SCISSOR =1;
    static final int OPTION_ROCK =2;
    static final int OPTION_PAPER =3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //승 , 무 , 패를 저장할 int 변수
        int win=0;
        int lose=0;
        int draw=0;
        
        while(true) {
            System.out.println("1.플레이하기");
            System.out.println("2.기록보기");
            System.out.println("3.종료");
            int userChoice =scanner.nextInt();
            
            if (userChoice ==1) {
                //플레이 코드 구현
                //1. 컴퓨터 숫자 추첨
                int computerNumber=random.nextInt(OPTION_SIZE)+1;
                
                //2. 사용자 숫자 입력
                //   단 사용자가 입력한 숫자가 유효한 숫자인지 체크
                System.out.println("1.가위 2.바위 3.보");
                System.out.println(">");
                int userNumber=scanner.nextInt();
                
                while(!(userNumber >= OPTION_SCISSOR && userNumber <= OPTION_PAPER)) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("1.가위 2.바위 3.보 를 선택해주세요");
                    userNumber = scanner.nextInt();
                }
                //고른 선택지 출력
                if(userNumber == OPTION_SCISSOR){
                    System.out.println("사용자 : 가위");
                }else if(userNumber == OPTION_ROCK) {
                    System.out.println("사용자 : 바위");
                }else if(userNumber ==  OPTION_PAPER) {
                    System.out.println("사용자 : 보");
                }
                if(computerNumber == OPTION_SCISSOR){
                    System.out.println("컴퓨터 : 가위");
                }else if(computerNumber == OPTION_ROCK) {
                    System.out.println("컴퓨터 : 바위");
                }else if(computerNumber ==  OPTION_PAPER)
                    System.out.println("컴퓨터 : 보");
                
                //3. 컴퓨터와 사용자의 숫자 비교후 결과 결정
                if(userNumber == computerNumber) {
                    //두 숫자가 같다라는 것은 무승부의 의미
                    System.out.println("무승부입니다!");
                    draw++;
                }else {
                    //무승부가 아닐경우, 사용자의 값에 대해 각각 처리해준다
                    if(userNumber == OPTION_SCISSOR) {
                        if(computerNumber == OPTION_ROCK) {
                            System.out.println("패배");
                            lose++;
                        }else if(computerNumber == OPTION_PAPER) {
                            System.out.println("승리");
                            win++;
                        }
                        
                    }else if(userNumber == OPTION_ROCK){
                        if(computerNumber == OPTION_SCISSOR) {
                            System.out.println("승리");
                            win++;
                        }else if(computerNumber == OPTION_PAPER) {
                            System.out.println("패배");
                            lose++;
                        }
                        
                    }else if(userNumber == OPTION_PAPER) {
                        if(computerNumber == OPTION_ROCK) {
                            System.out.println("승리");
                            win++;
                        }else if(computerNumber == OPTION_SCISSOR) {
                            System.out.println("패배");
                            lose++;
                        }
                        
                    }
                }
                //4. 결과 등록
            }else if(userChoice==2) {
                int total = win +draw +lose;
                if (total >0) {
                    //플레이한 전적이 있음
                    double winRate = (double)win/total;
                    System.out.printf("%3d전 %3d승 %3d무 %3d패 (승률 : %6.2f%%)",total,win,draw,lose,winRate*100);
                    System.out.println();
                }else {
                    System.out.println("플레이 기록이 없습니다.");
                }
            }else if(userChoice==3) {
                System.out.println("플레이 해주셔서 감사합니다.");
                break;
            }
        }
        
        
        scanner.close();
    }
    

}
