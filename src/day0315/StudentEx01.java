package day0315;

public class StudentEx01 {

    public static void main(String[] args) {
        Student s =new Student();
        s.showInfo();
        s.id=1;
        s.name = new String("김은비");
        s.korean = 80;
        s.english = 93;
        s.math=67;
        System.out.println();
        s.showInfo();
        
        Student s2 = new Student(1,"김뫄뫄",90,87,45);
        s2.id = 2;
        s2.name = new String("김은빙");
        s2.korean = 79;
        s2.english = 53;
        s2.math=87;
        System.out.println();
        s2.showInfo();
        
        System.out.println("s.equals(s2) : " + s.equals(s2));
        String str = new String("안녕하세요");
        System.out.println("s.equals(str) : " + s.equals(str));
    }
    

}


