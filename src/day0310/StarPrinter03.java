package day0310;

import java.util.Scanner;
public class StarPrinter03 {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("출력할 줄 수를 입력해주세요.");
            int userNumber= scanner.nextInt();
            
            char[][] stars = new char[userNumber][userNumber];
            
            for(int i =0 ; i<stars.length; i++) {
                for(int j = 0; i <stars[i].length; i++) {
                  //공백을 담당하는 if
                   if(j <userNumber - (i+1)) {
                       stars[i][j] =' ';
                   }else {
                     //별을 담당하는 else문
                       stars[i][j]= '*';
                   }
                
                
                    
                }
            }
            scanner.close();
        }

    }
