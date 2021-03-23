package model;

import java.util.Calendar;

public class EvaluationDTO {
    //평가번호
    private int id;
    //해당 평가가 적힌 교사 번호
    private int teacherId;
    //해당 평가를 적은 학생 번호
    private int studentId;
    //내용
    private String content;
    //작성일
    private Calendar writtenDate;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Calendar getWrittenDate() {
        return writtenDate;
    }
    public void setWrittenDate(Calendar writtenDate) {
        this.writtenDate = writtenDate;
    }
    
    public boolean equals(Object o) {
        if(o instanceof EvaluationDTO) {
            EvaluationDTO e = (EvaluationDTO)o;
            if(id == e.id) {
                return true;
            }
        }
        return false;
    }
}
