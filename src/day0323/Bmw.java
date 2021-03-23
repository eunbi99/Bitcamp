package day0323;

public class Bmw implements Car{
  //1.차량 번호 ("00가 0000")
  //2.모델명("소나타")
  //3.가격(3000) - >3000만원을 의미
  //4.색상("검정")
    
    String number = "11가 1111";
    String model = "bmw x5";
    int price = 10000;
    String color = "흰색";
    
    public void turnOn() {
        System.out.println("bmw가 시동을 켭니다.");
    }

    public void speedUp() {
        System.out.println("bmw가 속도를 냅니다.");
    }

    public void speedDown() {
        System.out.println("bmw가 속도를 줄입니다.");
    }

    public void goLeft() {
        System.out.println("bmw가 왼쪽으로 갑니다.");
    }

    public void goRight() {
       System.out.println("bmw가 오른쪽으로 갑니다.");
    }

    public void park() {
        System.out.println("bmw가 주차를 합니다.");
    }

    public void turnOff() {
        System.out.println("bmw가 시동을 끕니다.");
    }


}
