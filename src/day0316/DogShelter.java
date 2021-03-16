package day0316;

import java.util.ArrayList;
import java.util.Scanner;

/*우리가 기존에 만들었던 Dog 클래스와 ArrayList를 사용하여
 * 강아지 임시 보호소 프로그램을 만들어 보세요.
 * 
 * 기본적으로 ArrayList안에 3마리의 강아지를 임의로 넣고
 * while을 시작하세요
 * 
 * 1.잃어버린 개 등록 2.일치하는 개 찾기 3. 주인 찾은 개 목록에서 삭제 4. 종료
 * 4가지 기능이 있습니다.
 */
import day0315.Dog;
import util.ScannerUtil;
import java.util.ArrayList;
public class DogShelter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Dog> list = new ArrayList<>();
        
        Dog d1 = new Dog("멍이","A111", "퍼그" ,16);
        list.add(d1);
        Dog d2 = new Dog("춘봉","A222", "포메", 3);
        list.add(d2);
        Dog d3 = new Dog("콩이","A333", "푸들" , 10);
        list.add(d3);
        while(true) {
            System.out.println();
            int userChoice = ScannerUtil.nextInt(scanner, "1.잃어버린 개 등록 2.일치하는 개 찾기 3. 주인 찾은 개 목록에서 삭제 4. 종료",1,4);
            if(userChoice == 1) {
                //잃어버린 개를 리스트에 등록
                Dog d = new Dog();
                String message = new String("강아지 등록번호 :");
                d.setId(ScannerUtil.nextLine(scanner, message));
                while(list.contains(d)) {
                    System.out.println("해당 번호는 이미 등록된 번호 입니다.");
                    d.setId(ScannerUtil.nextLine(scanner, message));
                }
                message = new String("강아지 이름 :");
                d.setName(ScannerUtil.nextLine(scanner, message));
                message = new String("강아지 품종 :"); 
                d.setBreed(ScannerUtil.nextLine(scanner, message));
                message = new String("강아지 나이 :");
                d.setAge(ScannerUtil.nextInt(scanner, message));
                
                list.add(d);
       
            }else if(userChoice ==2) {
                //일치하는 개가 있는지 찾는다.
                
                Dog d = new Dog();
                String message =new String("강아지 등록번호 : ");
                d.setId(ScannerUtil.nextLine(scanner, message));
                
                if(list.contains(d)) {
                    //등록번호가 일치하는 강아지가 있으므로, 해당 강아지 정보를 보여준다.
                    int index = list.indexOf(d);
                    list.get(index).printInfo();
                }else {
                    //등록번호가 일치하는 강아지가 없으므로, 경고 메시지만 출력
                    System.out.println("해당 등록번호로 등록된 강아지는 이 보호센터에 없습니다.");
                }
            }else if(userChoice ==3) {
                //일치하는 개 리스트에서 삭제
                Dog d = new Dog();
                String message = new String("강아지의 등록번호 : ");
                d.setId(ScannerUtil.nextLine(scanner, message));
                if(list.contains(d)) {
                    System.out.println("해당 강아지는 이 보호센터에서 보호가 종료되었습니다.");
                    list.remove(d);
                }else {
                    System.out.println("해당 등록번호로 등록된 강아지는 이 보호센터에 없습니다.");
                }
            }else if(userChoice == 4) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
        scanner.close();
    }
    

}
