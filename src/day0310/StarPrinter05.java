package day0310;

import java.util.Scanner;
public class StarPrinter05 {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("출력할 줄 수를 입력해주세요.");
            int userNumber= scanner.nextInt();
            int max=2 * userNumber -1;
            
            char[][] stars = new char[userNumber][max];
            for(int i =0 ; i<stars.length; i++) {
                //별의 갯수 = (i+1) * 2 -1
                //      = 2 * i +2 -1
                //      = 2* i + 1
                int starWidth=2 * i + 1;
                //별이 찍히는 시작 시점 : 4 - 3 -2 -1 -0
                //             =userNumber - (i+1)
                int starStart = userNumber - (i+1);
                  
                //별을 담당하는 j for문 
                for(int j= starStart; j<starStart + starWidth ; j++) {
                    stars[i][j] = '*';
                }
             }

            for(int i =0; i<stars.length;i++) {
                for(int j =0; j<stars[i].length; j++) {
                    System.out.print(stars[i][j]);
                }
                System.out.println();
            }
            scanner.close();

        }

    }
