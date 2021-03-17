package day0317;
import day0317.Board;
import java.util.ArrayList;
import java.util.Scanner;
import util.ScannerUtil;
public class Board01 {
    //Board객체를 저장하고 관리할 ArrayList<Board> 객체
    private static ArrayList<Board> boardList = new ArrayList<>();
    //키보드 입력을 처리해줄 Scanner 객체
    private static Scanner scanner =new Scanner(System.in);
    //글 번호를 자동으로 넣어줄때 사용될 int 변수
    private static int currentId =1;
    public static void main(String[] args) {
        showMenu();
    }

    
//메뉴를 보여주는 메소드
private static void showMenu() {
    while(true) {
        System.out.println("======================");
        System.out.println("         게시판                   ");
        System.out.println("======================");
        String message = new String("1.글쓰기 \n 2.게시판 목록보기 \n 3.종료");
        int userChoice = ScannerUtil.nextInt(scanner, message,1,3);
        
        if(userChoice ==1) {
            //글 작성 담당 메소드 호출
            writeBoard();
        }else if(userChoice ==2) {
            //글 목록 보기 담당 메소드 호출
            selectAll();
            
        }else if(userChoice ==3) {
            System.out.println("사용해주셔서 감사합니다.");
            break;
        }
    }
}
// 글 작성을 담당하는 메소드
    private static void writeBoard() {
        //정보를 담을 Board 객체 생성
        Board board = new Board();
        
        //Board 객체에 제목을 넣고 
        String message = new String("제목을 입력해 주세요.");
        board.setTitle(ScannerUtil.nextLine(scanner, message));
        //중복이면 다시 입력 받게 한다.
        while(boardList.contains(board)) {
            System.out.println("중복된 글 제목은 사용하실 수 없습니다.");
            board.setTitle(ScannerUtil.nextLine(scanner, message));
        }
        
        //나머지 정보 입력
        //전역변수 currentIndex의 값을 넣고, currentIndex의 값을 1 증가시킨다.
        
        board.setId(currentId++);
        //글의 작성자를 입력받는다.
        message = new String("작성자를 입력해 주세요.");
        board.setWriter(ScannerUtil.nextLine(scanner, message));
        
        //글의 내용을 입력받는다.
        message = new String("글 내용을 입력해 주세요.");
        board.setContent(ScannerUtil.nextLine(scanner, message)); 
        //boardList에 추가
        boardList.add(board);
    }
    
    //글 목록보기를 담당하는 메소드
    private static void selectAll() {
        while(true) {
            //만약 글이 boardList에 하나도 없을 시에는
            //메세지 출력 후 break를 통해 , 무한루프를 종료 시킨다.
            
            if(boardList.size() ==0){
                System.out.println();
                System.out.println("아직 입력된 글이 없습니다.");
                System.out.println();
                break;
            }
            System.out.println();
            
            //for문을 통하여
            //list에 인덱스와 글 제목을 출력해준다.
            for(int i = 0; i <boardList.size(); i++) {
                System.out.printf("%d . %s \n", i+1, boardList.get(i).getTitle());
            }
            
            //사용자로부터 개별보기할 글의 인덱스나 혹은 뒤로가기를 선택하도록 입력을 받는다.
            //개별 보기 할 경우,  해당 메소드를 호출해 준다.
            String message =new String("개별 보기할 게시물의 번호를 선택해주세요.만약 메뉴로 가시려면 0을 눌러주세요. ");
            //사용자는 1부터 입력 하겠지만 컴퓨터는 0부터 세기때문에 -1을 해주어야한다.
            int userChoice = ScannerUtil.nextInt(scanner, message,0,boardList.size())-1;
            
            //뒤로가기를 할 경우 , break를 통해 showMenu() 메소드로 돌아가게 만들어준다.
            if(userChoice ==-1) {
                System.out.println();
                System.out.println("메뉴로 돌아갑니다.");
                System.out.println();
                break;
            }else {
                //개별보기 할 경우, 해당 메소드를 호출해준다.
                selectOne(userChoice);
            }
        }
    }
    //글 개별보기를 담당하는 메소드
    private static void selectOne(int index) {
        //boardList의 index번에 저장된 객체의 printBoard()메소드를 실행한다.
        boardList.get(index).printBoard();
        //사용자에게 수정, 삭제, 뒤로가기 중 하나를 선택하도록 입력을 받는다.
        String message = new String("1.수정 2.삭제 3.뒤로가기 ");
        int userChoice =ScannerUtil.nextInt(scanner, message,1,3);
        
        //수정을 선택하면 update메소드를 실행
        if(userChoice ==1) {
            update(index);
            selectOne(index);
        //삭제를 선택하면 delete메소드를 실행
        }else if(userChoice ==2) {
            delete(index);
        }
        
    }
    //글 수정을 담당하는 메소드
    private static void update(int index) {
        //1.제목이 중복인지부터 체크하기위해 
        //  임시로 Board 객체를 하나 만들어서
        //  그 객체에 제목을 넣고
        //  그 객체가 boardList에 contains()메소드에서
        //  true가 나오는지 확인하여
        //  false가 나올때 까지 제목을 다시 입력받는다.
        String message = new String("제목을 입력해 주세요.");
        Board board = new Board();
        board.setTitle(ScannerUtil.nextLine(scanner, message));
        
        while(boardList.contains(board) && !board.equals(boardList.get(index))) {
            System.out.println("중복된 제목입니다. 다시 입력해주세요.");
            board.setTitle(ScannerUtil.nextLine(scanner, message));
        }
        
        //2.임시로 만든 board객체의 제목을 boardList의 index번 객체에 저장한다.
        boardList.get(index).setTitle(board.getTitle());
        //3. 그외의 정보를 boardList의 index번 객체에 저장한다.
        message = new String("작성자를 수정해주세요.");
        boardList.get(index).setWriter(ScannerUtil.nextLine(scanner, message));
        
        message = new String("내용을 수정해주세요.");
        boardList.get(index).setContent(ScannerUtil.nextLine(scanner, message));
        //4.다시 개별글 보기 메소드를 실행한다.
        
        selectOne(index);
    }
    //글 삭제를 담당하는 메소드
    private static void delete(int index) {
        //1.사용자로부터 정말로 삭제할지 물어봐서 사용자로부터 입력을 받는다.
        String message = new String("정말로 삭제하시겠습니까? 삭제하려면 Y나 y를 입력해주세요");
        String yesNo = ScannerUtil.nextLine(scanner, message);
        //2.사용자가 대소문자 y를 입력했을 경우, 해당 index를 삭제한다.
        if(yesNo.equalsIgnoreCase("Y")) {
            boardList.remove(index);
        //3.그 외에 다른 글자를 입력했을 경우, selectOne(index)를 실행한다.
        }else {
            selectOne(index);
        }
    }
    }   

  
    
       
        