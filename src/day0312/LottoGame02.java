package day0312;

import java.util.Random;
import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;

public class LottoGame02 {
    static final int NUMBER_MAX=45;
    static final int NUMBER_MIN=1;
    static final int NUMBER_SIZE =6;
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int[] computerArray = new int[NUMBER_SIZE];
    
    int index = 0;

    while(index < NUMBER_SIZE) {
        int randomNumber = random.nextInt(NUMBER_MAX) +1;
        
        //중복이 있으면 true / 중복 없으면 false 
         boolean inputSwitch = ArrayUtil.contains(computerArray, randomNumber);

        if(!inputSwitch) {
            computerArray[index] =randomNumber;
            index ++;

        }
    }
    //사용자가 총 몇게임 할지 입력받는다.
    int userGameSize= ScannerUtil.nextInt(scanner, "총 몇게임을 하시겠습니까?");
    //사용자가 입력한 숫자를 토대로해서
    //2차원 배열을 만든다.
    int[][] userArrays = new int[userGameSize][NUMBER_SIZE];
    
    //사용자가 입력한 게임 숫자에 따라서 수동 혹은 자동을 선택하게 하고
    //그거에 맞춰서 숫자를 배분한다.
    for(int i =0 ; i< userArrays.length ; i++) {
        System.out.println();
        System.out.println("========="+ (i+1)+ "번 게임 ========");
        int userChoice = ScannerUtil.nextInt(scanner, "1.수동  2.자동 ");
    

        index =0;
        boolean inputSwitch = false;
        if(userChoice ==1) {

            while (index < userArrays[i].length) {

                int userNumber= ScannerUtil.nextInt(scanner, (index +1)+"번 숫자를 입력해주세요");
 
                if( userNumber >= NUMBER_MIN && userNumber <=NUMBER_MAX) {
                    
                    //중복이면 true  ; 중복 아니면 false;
                    inputSwitch = ArrayUtil.contains(userArrays[i], userNumber);

                    if(!inputSwitch ) {
                        userArrays[i][index] =userNumber;
                        index++;
                    }else {
                        System.out.println("중복된 숫자입니다.다시 입력해주세요");
                    }
                    
                }else {
                    System.out.println("잘못된 숫자입니다.다시 입력해주세요");
                }

            }
        } else {
            // 사용자가 자동으로 골랐을 경우
            // 컴퓨터의 랜덤 숫자 코드와 매우 유사하지만
            // 저장되는 위치가 computerArray[index] 가 아니라
            // userArrays[i][index] 로 바뀔 뿐이다.
    
            while (index < NUMBER_SIZE) {
                // 랜덤한 숫자를 만들어준다.
                int randomNumber = random.nextInt(NUMBER_MAX) + 1;

                // 만약 해당 randomNumber가 배열에 존재하지 않으면 true, 존재하면 false가 되는
                // boolean inputSwitch 를 만들고 true로 초기화해준다.
                inputSwitch = true;
                for (int j = 0; j < userArrays[i].length; j++) {
                    if (randomNumber == userArrays[i][j]) {
                        inputSwitch = false;
                        break;
                    }
                }

                if (inputSwitch) {
                    userArrays[i][index] = randomNumber;
                    index++;
                }

            }
        }
    }

    
    //정렬하는 코드
    //1.컴퓨터 배열 정렬하기
    for(int i=0 ; i<computerArray.length -1 ; i++) {
        if(computerArray[i] > computerArray[i+1]) {
            int temp =computerArray[i];
            computerArray[i] =computerArray[i+1];
            computerArray[i+1] =temp;
            i=-1;
            
        }
    }
    
    //2.사용자의 각 배열 정렬하기
    for(int i =0 ; i< userArrays.length; i++) {
        for(int j=0; j<userArrays[i].length-1; j++) {
            if(userArrays[i][j] > userArrays[i][j+1]) {
                int temp =userArrays[i][j];
                userArrays[i][j]= userArrays[i][j+1];
                userArrays[i][j+1]=temp;
            }
        }
    }
    //컴퓨터의 숫자와
    //사용자의 게임 내역을 비교해서
    //맞춘갯수 + 등수 까지 , 보여준다.
    //1.컴퓨터의 숫자를 [## , ## ... ##]으로 보여준다.
    System.out.printf("컴퓨터의 숫자 : [%2d, %2d, %2d ,%2d , %2d]\n",
            computerArray[0] , computerArray[1],computerArray[2],computerArray[3],computerArray[04],computerArray[5] );
        
    //2.사용자의 숫자를
    //  게임  ##번 : [##,##, ... ##], 맞춘갯수 : ##개 , 등수 : #개
    //  의 형식으로 출력해준다
    
    for(int i = 0 ; i < userArrays.length; i++) {
        //1.등수를 위하여, 사용자의 i번째 배열의 값과
        // computer의 숫자를 비교하여, 몇개나 일치하는지
        // 갯수를 센다.
        
        int count=0;
        for(int j =0; j< userArrays[i].length; j++) {
            for(int k=0; k< computerArray.length; k++) {
                if(userArrays[i][j] == computerArray[k]) {
                    count++;
                }
            }
        }
        System.out.printf("게임 %2d번 : [%2d ,%2d , %2d ,%2d . %2d ,%2d] 맞춘 갯수 : %2d개,",
                i+1 ,userArrays[i][0],userArrays[i][1],userArrays[i][2],
                userArrays[i][3],userArrays[i][4],userArrays[i][5],count);
        if(count >=2) {
            System.out.println("등수 : " + (NUMBER_SIZE -count +1)+ "등");
        }else {
            System.out.println("등수 : 등수 없음");
        }
    }
    scanner.close();
    }
    
    }
