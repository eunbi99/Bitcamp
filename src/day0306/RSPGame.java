package day0306;
/* 가위바위보 게임
 * 사용자가 1은 가위, 2는 바위 3은 보 로 해서
 * 컴퓨터와 가위바위보 게임을 한다.
 * 
 * 1.플레이
 * 사용자가 1-3 사이의 숫자를 고르고
 * 컴퓨터가 1-3 사이의 숫자를 고르고 나서 
 * 결과를 확인해서
 * 승리, 무승부 , 패배 3가지 중 하나를 정해서
 * 기록한다.
 * 
 * 2. 출력
 * 출력은 플레이 기록이 존재할 경우
 *  ###전 ###승 ###패(승률 : ##.###%)
 *  printf에서는 %를 "출력" 해줄때 즉, %문자가 아니라 글자 %를 출력할때는 %%라고 적어주면 된다!!
 *  
 *  3.종료
 *  
 *  이 세가지 기능을 가지고 있는 가위바위보 게임을 만들어보자
 */

import java.util.Random;
import java.util.Scanner;

public class RSPGame {
    static final int NUMBER_MAX = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int record =0;
        int win=0;
        int lose=0;
        int same=0;
        double winRecord=(double)win/(win+lose+same);
        
        while(true) {    
            System.out.println("1.플레이 2.출력 3.종료");
            int userChoice =scanner.nextInt();
        if(userChoice==1) {
            System.out.println("1.가위 2.바위 3.보 를 선택해주세요 ");
            System.out.println(">");
            int inputNum = scanner.nextInt();
            
            int computerNumber = random.nextInt(NUMBER_MAX) + 1;
            System.out.println("사용자 ->" + inputNum);
            System.out.println("컴퓨터 ->" + computerNumber);
            
            
            if(inputNum ==1 ) {
                if(computerNumber ==1) {
                    System.out.println("무승부");
                    same++;
                }else if(computerNumber ==2){
                    System.out.println("패배");
                    lose++;
                }else if(computerNumber ==3) {
                    System.out.println("승리");
                    win++;
                }
            }else if(inputNum ==2) {
                if(computerNumber ==1) {
                    System.out.println("승리");
                    win++;
                }else if(computerNumber ==2){
                    System.out.println("무승부");
                    same++;
                }else if(computerNumber ==3) {
                    System.out.println("패배");
                    lose++;
                }
            }else if(inputNum==3) {
                if(computerNumber ==1) {
                    System.out.println("패배");
                    lose++;
                }else if(computerNumber ==2){
                    System.out.println("승리");
                    win++;
                }else if(computerNumber ==3) {
                    System.out.println("무승부");
                    same++;
                }
            }              
                while(!(inputNum>0 && inputNum<4)){
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("1.가위 2.바위 3.보 를 선택해주세요");
                    inputNum = scanner.nextInt();
            }
                record++;
        }else if(userChoice ==2) {
            if(record>0) {
                System.out.printf("%3d전 %3d승 %3d무 %3d패 (승률 : %6.2f%%)",record,win,same,lose,winRecord*100);
                System.out.println();
            }else {
                System.out.println("기록이 없습니다.");
            }
        }else if(userChoice==3) {
            System.out.println("게임을 종료합니다.");
            break;
        }
          
       
    }
        }
    
}
