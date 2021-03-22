package model;

public class TeacherDTO {
    private int id;
    //교사가 로그인시 사용할 아이디
    private String username;
    //교사가 로그인시 사용할 비밀번호
    private String password;
    //교사이름
    private String name;
    //교사 소속반
    private int group;
    
                                
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    
    //equals()
    public boolean equals(Object o) {
        if(o instanceof TeacherDTO) {
            TeacherDTO t = (TeacherDTO)o;
            if(id == t.id) {
                return true;
            }
        }
        
        return false;
    }
    
}
