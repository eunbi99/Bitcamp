package day0309;
/*로또 게임
 * 사용자로부터 숫자 6개를 입력받아서
 * 정렬하여 출력하시오
 * 
 * 단 사용자가 잘못된 숫자 혹은 중복된 숫자를 입력하면 올바른 숫자를 
 * 입력할때 까지 다시 입력을 받도록 하시오.
 */
import java.util.Scanner;
public class LottoGame04 {
static final int SIZE =6;
static final int NUMBER_MAX =45;
public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int[] lottoNumbers = new int[SIZE];

        int idx=0;
        
        while(idx < lottoNumbers.length) {
            System.out.println("1-45까지 로또 번호를 입력하세요");
            int userNumber= scanner.nextInt();
            
            boolean numberChecker =true;
            
            for(int i=0; i< lottoNumbers.length; i++) {
                if(userNumber == lottoNumbers[i]){
                    numberChecker=false;
                    System.out.println("중복되는 값입니다.다시 입력하세요");
                    break;
                }else if(!(userNumber>0 && userNumber<=45)) {
                    numberChecker=false;
                    System.out.println("값을 잘못 입력하셨습니다. 다시 입력하세요 ");
                    break;     
                }
            }
            
            if(numberChecker) {
                lottoNumbers[idx] = userNumber;
                idx++;
            }
        }
        for(int i=0; i< lottoNumbers.length -1 ; i++) {
            if(lottoNumbers[i] > lottoNumbers[i+1]) {
                int temp= lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[i+1];
                lottoNumbers[i+1] = temp;
                i = -1;
            } 
            
        }
        
      
        System.out.println();
        System.out.println("입력한 로또번호");
        System.out.println();
        
        for(int i=0; i<lottoNumbers.length; i++) {
            System.out.printf("로또번호[%d] : [%2d]\n ",i,lottoNumbers[i]);
        }
    }

}
