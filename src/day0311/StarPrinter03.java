package day0311;

import java.util.Scanner;
public class StarPrinter03 {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("출력할 줄 수를 입력해주세요.");
            int userNumber= scanner.nextInt();
            
            char[][] stars = new char[userNumber][userNumber];
            
            for(int i =0 ; i<stars.length; i++) {
                for(int j = 0; j <userNumber - (i+1); j++) {
                    stars[i][j] = ' ';
                    
                }
               for(int j =userNumber - (i +1); j <userNumber; j++) {
                   stars[i][j]= '*';
               }
            }
            
            for(int i =0; i<stars.length; i++) {
                for(int j =0; j <stars[i].length; j++) {
                    System.out.print(stars[i][j]);
                    
                }
                System.out.println();
            }
            scanner.close();
        }

    }
