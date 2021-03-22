package viewer;

import java.util.Scanner;

import controller.TeacherController;
import model.TeacherDTO;
import util.ScannerUtil;

public class TeacherViewer {
    private Scanner scanner ;
    private TeacherController controller;
    
    public TeacherViewer() {
        scanner = new Scanner(System.in);
        controller = new TeacherController();
        
    }
    //교사용 회원가입
    public void register() {
        //사용자가 입력한 정보를 담을 TeacherDTO 객체 t
        TeacherDTO t = new TeacherDTO();
        
        String message ;
        
        //아이디입력
        message = new String("사용하실 아이디를 입력하세요.");
        String username = ScannerUtil.nextLine(scanner, message);
        
        //아이디가 유효한 아이디인지 체크
        while(controller.validateUsername(t)) {
            System.out.println("이미 중복된 아이디입니다.");
            username = ScannerUtil.nextLine(scanner, message);
            t.setUsername(ScannerUtil.nextLine(scanner, message));
        }
        
        t.setUsername(username);
        
        //비밀번호 입력
        message = new String("사용하실 비밀번호를 입력하세요.");
        t.setPassword(ScannerUtil.nextLine(scanner, message));
       
        //이름 입력
        message = new String("이름을 입력하세요.");
        t.setName(ScannerUtil.nextLine(scanner, message));
        //반 입력
        message = new String("소속반을 입력하세요.");
        t.setGroup(ScannerUtil.nextInt(scanner, message));
        
        //유효한 반인지 체크
        while(controller.validateGroup(t)) {
            System.out.println("이미 담당교사가 존재하는 반입니다.");
            t.setGroup(ScannerUtil.nextInt(scanner, message));
        }
        
        //컨트롤러의 add메소드 호출
        
        controller.add(t);
        
    }
    
    //로그인 담당 메소드
    public int logIn() {
        //사용자가 입력할 정보를 담을 TeacherDTO 객체 t
        TeacherDTO t = new TeacherDTO();
        //출력할 메시지를 담는 String 객체 message
        String message ;
        
        //아이디 입력
        message = new String("아이디를 입력하세요.");
        t.setUsername(ScannerUtil.nextLine(scanner, message));
        
        //비밀번호 입력
        message = new String("비밀번호를 입력하세요.");
        t.setPassword(ScannerUtil.nextLine(scanner, message));
        
        //결과값을 TeacherDTO 객체 result에 넣는다.
        TeacherDTO result = controller.auth(t);
        
        //result가 널인지 확인하여
        //null일 경우 다시 묻는다.
        while(result == null) {
            System.out.println("잘못 입력하셨습니다.");
            message = new String("종료하시겠습니까? y/n");
            String agree = ScannerUtil.nextLine(scanner, message);
            if(agree.equalsIgnoreCase("y")) {
                return -1;
            }
            
            message = new String("아이디를 입력하세요.");
            t.setUsername(ScannerUtil.nextLine(scanner, message));
            
            //비밀번호 입력
            message = new String("비밀번호를 입력하세요.");
            t.setPassword(ScannerUtil.nextLine(scanner, message));
            
            result = controller.auth(t);
        }
        //result가 null이 아닐 경우
        //result.getGroup()을 return 한다.
        
       return result.getGroup();
    }
}
