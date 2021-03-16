package day0316;
/*게시판 관리 프로그램에서 사용될 사용자 클래스
 * 필드 : 회원번호 id , 회원 userNamer, 회원 password, 회원 닉네임
 * 메소드 : 겟터 /셋터, id와 userName을 기준으로한 equals(), id와 비밀번호가 맞으면 true가 나오는 로그인()
 */
public class User {
    int id ;
    String userName;
    String password;
    String nickname;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    

    public boolean equals(Object o) {
        if(o instanceof User) {
            User u = (User)o;
            if(id == u.id && userName.equals(u.userName)) {
                return true;
            }
        }
        return false;
        
    }
    
    public boolean login(String userName , int passWord) {
        if(this.userName.equals(userName) && this.password.equals(password)) {
            return true;
        }
        return false;
    }
}
