package day0317;

public class Board {
    private int id;
    private String title;
    private String writer;
    private String content;
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
 
    //equals()
    public boolean equals(Object o) {
        if(o instanceof Board) {
            Board b= (Board)o;
            if(title.equals(b.title)) {
                return true;
            }
        }
        return false;
    }
    public void printBoard() {
        System.out.printf("=================게시판 정보 =================");
        System.out.printf("번호 : %04d\n ",id);
        System.out.printf("제목  : %s         |   작성자 : %s \n" ,title,writer);
        System.out.println("-------------------------------------------");
        System.out.printf("내용 :  %s \n", content);
        System.out.println("============================================");
        System.out.println();
    }

}
