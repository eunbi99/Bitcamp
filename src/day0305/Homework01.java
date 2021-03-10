package day0305;
/* bmi checker을
 * 입력과 출력을 나눈 메뉴 버전으로 고치시오 
 */
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
    public class Homework01 {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            
            // 키, 몸무게, 입력스위치 변수 선언 및 초기화
            double height =0;
            double weight =0;
            boolean inputCheck=false;
            
            //입력
            while(true) {
                System.out.println("1.입력 2.출력 3.종료");
                int userChoice = scanner.nextInt();

                if(userChoice ==1) {
                    //1.키 입력
                    System.out.printf("키를 입력해주세요 : ");
                    height =scanner.nextDouble();
                    
                   //2.키 검증
                    while(!(height>0 && height <=2.82)) {
                        System.out.println("키를 다시 입력해주세요");
                        height =scanner.nextDouble();
                    }
                        
                    //3.몸무게 입력
                    System.out.printf("몸무게를 입력해주세요 : ");    
                    weight = scanner.nextDouble();
                    
                    //4.몸무게 검증
                    while(!(weight>=0 && weight <=635)) {
                        System.out.println("몸무게를 다시 입력해주세요");
                        weight = scanner.nextDouble();
                    }
                    
                    //5.입력스위치 true로 변경
                    inputCheck=true;
 
                }else if(userChoice==2){
                    //inputcheck는 사용자가 입력한지 체크.
                    //만약 값이 있다면 값 출력 , 없다면 정보 다시 입력창.
                    if(inputCheck) {
                        double bmi= weight/height/height;
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
                        System.out.println("아직 입력된 정보가 없습니다.");
                    }
                }else if (userChoice==3) {
                    System.out.println("사용해주셔서 감사합니다.");
                    break;
                }
            }
            scanner.close();
        }

    }
