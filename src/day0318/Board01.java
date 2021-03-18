package day0318;
import day0317.Board;
import java.util.ArrayList;
import java.util.Scanner;
import util.ScannerUtil;
//글의 제목이 아닌 번호로 객체를 컨트롤 하는 버전의 Board01
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
                System.out.printf("%d . %s \n", boardList.get(i).getId(), boardList.get(i).getTitle());
            }
            
            //사용자로부터 개별보기할 글의 id나 혹은 뒤로가기를 선택하도록 입력을 받는다.
            //개별 보기 할 경우,  해당 메소드를 호출해 준다.
            String message =new String("개별 보기할 게시물의 번호를 선택해주세요.만약 메뉴로 가시려면 0을 눌러주세요. ");
            int userChoice = ScannerUtil.nextInt(scanner, message);
            //사용자가 입력한 글의 id가 유효한 글의 id인지 체크하고, 유효하지 않으면 유효한 id나 0을 입력할때 까지
            //다시 입력을 받는다.
            
            //글의 id가 유효한지 체크하기 위해서 Board 객체를 하나 만들어서, 그 안에 사용자가 입력한 id 값을 입력한다(0이 아닐시)
            Board board =new Board();
            board.setId(userChoice);
            
            //while을 통해서 userChoice가 0이 아니고, b가 boardList에 존재하지 않을 시에
            //다시 입력을 받는다.
            
            while(!(userChoice ==0 || boardList.contains(board))) {
                System.out.println("해당 글 번호는 존재하지 않는 번호입니다.");
                userChoice =ScannerUtil.nextInt(scanner, message);
                board.setId(userChoice);
            }
            //뒤로가기를 할 경우 , break를 통해 showMenu() 메소드로 돌아가게 만들어준다.
            if(userChoice == 0) {
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
    private static void selectOne(int id) {
        //사용자로부터 넘겨받은 id를 사용해서
        //우리 리스트에서 해당 id를 가지고 있는 Board 객체를 불러온다.
        
        //1.Board 객체를 하나 만든다.
        Board board = new Board();
        
        //Board객체 b에 파라미터로 넘어온 id 값을 넣어준다.
        board.setId(id);
        
        //우리가 Board.java의 equals() 메소드를 
        //id 기준으로 구현했으므로 이제 indexOf 메소드를 실행시키면,
        //지금 현재 id 값을 가진 객체의 id값이 나오게 된다.
        
        int index = findIndex(id);
        
        //혹시라도 사용자가 유효하지않은 id값을 넣을 경우를 대비해
        //index가 -1일 경우, 경고 메시지만 출력하고
        //그 외에는 원래대로의 작업을 하게 해준다.
        
        if(index == -1) {
            //존재하지 않는 id값이므로 경고 메시지만 출력
            System.out.println();
            System.out.println("해당 글 번호는 존재하지 않는 글 번호입니다.");
            System.out.println();
            
        }else {
            //존재하는 id값이므로 추가작업 실행
          //boardList의 index번에 저장된 객체의 printBoard()메소드를 실행한다.
            boardList.get(index).printBoard();
            //사용자에게 수정, 삭제, 뒤로가기 중 하나를 선택하도록 입력을 받는다.
            String message = new String("1.수정 2.삭제 3.뒤로가기 ");
            int userChoice =ScannerUtil.nextInt(scanner, message,1,3);
            
            //수정을 선택하면 update메소드를 실행
            if(userChoice ==1) {
                update(id);
                selectOne(id);
            //삭제를 선택하면 delete메소드를 실행
            }else if(userChoice ==2) {
                delete(id);
            }
        }
            
    }
    //글 수정을 담당하는 메소드
    private static void update(int id) {
        //1.파라미터로 넘어온 id값을 사용하여
        //  인덱스를 찾는다.
        int index = findIndex(id);
        
        //2.만약 index가 -1일 경우
        //  해당 아이디가 존재하지 않으므로
        //  경고메시지만 출력하고 그 외에는 수정을 진행한다.
        
        if(index == -1) {
            System.out.println();
            System.out.println("해당 글 번호는 존재하지 않는 번호입니다.");
            System.out.println();
        }else {
            String message = new String("제목을 입력해 주세요.");
            //2. boardList의 index번 객체의 제목, 작성자 , 내용에 새로운 값을 저장해준다.
            boardList.get(index).setTitle(ScannerUtil.nextLine(scanner, message));
            
            message = new String("작성자를 수정해주세요.");
            boardList.get(index).setWriter(ScannerUtil.nextLine(scanner, message));
            
            message = new String("내용을 수정해주세요.");
            boardList.get(index).setContent(ScannerUtil.nextLine(scanner, message));
            
            //3.다시 개별글 보기 메소드를 실행한다.        
            selectOne(id);
        }
}
        
    //글 삭제를 담당하는 메소드 
    private static void delete(int id) {
        //1.파라미터로 받은 id를 이용하여 index를 불러온다.
        int index = findIndex(id);
        //2. index가 -1일 경우 해당 글번호가 유효하지 않다는 의미이므로
        //  경고 메시지만 출력하고 그 외에만 삭제를 진행한다.
        if(index == -1){
            System.out.println();
            System.out.println("해당 글 번호는 존재하지 않는 번호입니다");
        }else {
            String message = new String("정말로 삭제하시겠습니까? 삭제하려면 Y나 y를 입력해주세요");
            String yesNo = ScannerUtil.nextLine(scanner, message);
            //2.사용자가 대소문자 y를 입력했을 경우, 해당 index를 삭제한다.
            if(yesNo.equalsIgnoreCase("Y")) {
                boardList.remove(index);
            //3.그 외에 다른 글자를 입력했을 경우, selectOne(index)를 실행한다.
            }else {
                selectOne(id);
            }
        }
        //3.사용자로부터 정말로 삭제할지 물어봐서 사용자로부터 입력을 받는다.
     
    }

    private static int findIndex(int id) {
        int index = 0;
      //1.Board 객체를 하나 만든다.
        Board board = new Board();
        
        //Board객체 b에 파라미터로 넘어온 id 값을 넣어준다.
        board.setId(id);
        
        //우리가 Board.java의 equals() 메소드를 
        //id 기준으로 구현했으므로 이제 indexOf 메소드를 실행시키면,
        //객체의 index값이 나오게 된다.
        
        index = boardList.indexOf(board);
        return index;
    }
 }

  
    
       
        