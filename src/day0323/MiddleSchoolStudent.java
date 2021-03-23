package day0323;

public class MiddleSchoolStudent implements Student {

    @Override
    //@Annotation 이라는 문법으로써 @뒤의 기능을 메소드에 검사하거나 무언가 특정 기능을 부여할때 사용이 된다.
    //@Override 어노테이션은 해당 메소드가 부모 클래스/ 인터페이스의 메소드를 오버라이드 했으므로
    //부모 클래스가 선언한것과 똑같은지 확실하게 체크하라 라는 의미이다.
    public void study() {
        System.out.println("대충 대충 공부합니다.");
        
    }

    @Override
    public void goSchool() {
        System.out.println("1교시인 8시반 까지 학교에 갑니다.");
        
    }

    @Override
    public void eat() {
        System.out.println("점심은 급식 저녁은 집밥");
    }

    @Override
    public void test() {
        System.out.println("중간 고사랑 기말 고사만 잘보면 돼!!");
        
    }
    

}
