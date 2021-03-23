package day0323;

public class Hyundae implements Car{

    public void turnOn() {
   
       System.out.println("현대차가 시동을 켰다.");
    }

    public void speedUp() {
        System.out.println("현대차가 속도를 올렸다.");
        
    }

   
    public void speedDown() {
        // TODO Auto-generated method stub
        System.out.println("현대차가 속도를 내렸다.");
    }

    
    public void goLeft() {
        // TODO Auto-generated method stub
        System.out.println("현대차가 왼쪽으로 움직인다.");
    }

   
    public void goRight() {
        System.out.println("현대차가 오른쪽으로 움직인다.");
        
    }

    public void park() {
        // TODO Auto-generated method stub
        System.out.println("현대차가 주차를 한다.");
    }

    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println("현대차가 시동을 껐다.");
    }

}
