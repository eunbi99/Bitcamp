package day0305;
/*사용자로부터 키와 몸무게를 입력받아서
 * 사용자의 bmi 수치를 소숫점 2번째 자리까지 출력하고
 * 사용자의 체형이 어디에 속하는지도 출력하시오
 * 
 * bmi공식 :몸무게 (kg) /키(m)/키 (m)
 * 체형기준
 * ~18.5 미만: 저체중
 * ~23 미만 :정상
 * ~25미만: 과체중
 * 그외 :비만
 * 
 * 기네스북에 따르면 세상에서 가장 키가 컸던 사람의 키는 2.82m였습니다.
 * 기네스북에 따르면 세상에서 가장 몸무게가 많이 나갔던 사람의 무게는 635 킬로그램이었습니다.
 * 
 * 키를 잘못 입력하면 추가적인 입력 없이 경고 메시지만 출력하시오
 * 몸무게를 잘못 입력하면 결과 출력 대신 경고 메시지만 출력하시오 (45분)
*/


    import java.util.Scanner;
    public class BmiChecker02 {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);

                
               System.out.printf("키를 입력해주세요 : ");
                double m =scanner.nextDouble();
     
                if(m>0 && m<=2.82) {  
                    
                    System.out.printf("몸무게를 입력해주세요 : ");    
                    double kg = scanner.nextDouble();
                    
                    if(kg>0 && kg<=635) {
                        
                        double bmi= kg/m/m;
                        System.out.printf("사용자의 bmi수치 : [%.2f] \n",bmi);
                        
                        if(bmi <18.5) {
                            System.out.println("저체중입니다.");
                        }else if(bmi <23) {
                            System.out.println("정상입니다.");
                        }else if(bmi <25) {
                            System.out.println("과체중입니다.");
                        }else {
                            System.out.println("비만입니다.");
                        }
                        
                    }else {
                        System.out.println("몸무게를 잘못 입력하셨습니다.");
                    }
                
                }else {
                System.out.println("키를 잘못 입력 하셨습니다.");
            }
               
            scanner.close();
        }
        
    }
        
