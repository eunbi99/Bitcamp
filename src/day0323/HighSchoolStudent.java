package day0323;
//Student 인터페이스를 상속받는 클래스 HighSchoolStudent
//인터페이스의 상속은 implements 라는 키워드를 통해서 실행된다.
public class HighSchoolStudent implements Student{
    public void study() {
        System.out.println("인서울을 위해 열심히 공부합니다.");
    }
    
    public void goSchool() {
        System.out.println("0교시인 7시에 학교에 걸어갑니다.");
        
    }
    public void eat() {
        System.out.println("점심엔 급식 저녁엔 도시락");
    }
    public void test() {
        System.out.println("모의고사 봅니다.");
    }

}
