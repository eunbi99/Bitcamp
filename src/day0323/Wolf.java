package day0323;
/* "Canis" 클래스를 상속받는 Wolf클래스
 *  늑대 : 무리사냥을 해서 먹는다. 멋있다.
 *  
 *  
 */
public class Wolf extends Canis{
    public Wolf() {
        System.out.println("늑대생성자 호출");
    }
    public void showHandsome() {
        System.out.println("멋있다.");
    }
    
    public void eat() {
        System.out.println("무리사냥을 해서 먹는다.");
    }

}
