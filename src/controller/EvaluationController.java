package controller;

import java.util.ArrayList;
import java.util.Calendar;

import day0320.Evaluation;
import model.EvaluationDTO;

public class EvaluationController {
    private ArrayList<EvaluationDTO> list ;
    private int id;
    
    public EvaluationController() {
        list = new ArrayList<>();
        id =1;
        EvaluationDTO e1 = new EvaluationDTO();
        e1.setId(id++);
        e1.setStudentId(1);
        e1.setTeacherId(1);
        e1.setContent("좋아요");
        e1.setWrittenDate(Calendar.getInstance());
        
        list.add(e1);
        
        e1 = new EvaluationDTO();
        e1.setId(id++);
        e1.setStudentId(2);
        e1.setTeacherId(2);
        e1.setContent("정말 좋아요");
        e1.setWrittenDate(Calendar.getInstance());
        
        list.add(e1);
    }
    //1.id값을 받으면 해당 id 값과 일치하는 EvaluationDTO 객체를 리턴하는
    //selectOne()메소드
    public EvaluationDTO selectOne(int id) {
        for(EvaluationDTO e : list) {
            if(e.getId() == id) {
                return e;
            }
        }
        return null;
    }
    
    //2.교사의 id값을 받으면 해당 id값과 일치하는 EvaluationDTO 객체들을
    //ArrayList에 담아서 리턴하는 selectById() 메소드
    
    public ArrayList<EvaluationDTO> selectById(int teacherId){
        ArrayList<EvaluationDTO> temp = new ArrayList<>();
        
        for(EvaluationDTO e : list) {
            if(e.getTeacherId() == teacherId) {
                temp.add(e);
            }
        }
        return temp;
        
    }
    //사용자가 입력한 값을 EvaluationDTO의 객체 형태로 받아서
    //list에 추가하는 add()메소드
    public void add(EvaluationDTO e) {
        e.setId(id++);
        e.setWrittenDate(Calendar.getInstance());
        list.add(e);
    }
    //사용자가 입력한 id값과 일치하는 EvaluationDTO 객체를 삭제하는
    //delete() 메소드
    public void delete(EvaluationDTO e) {
        list.remove(e);
    }
    
    //사용자가 기존에 정보를 입력했는지 안했는지를 알려주는
    //validateStudentId()
    public boolean validateStudentId(int studentId) {
        for(EvaluationDTO e : list) {
            if(studentId == e.getStudentId()) {
                return true;
            }
        }
        
        return false;
    }
    
}
