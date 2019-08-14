package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.validator.ChildrenValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;   //ctrl + alt + B
import java.util.LinkedList;
import java.util.List;
//import edu.javacourse.studentorder.domain.children.AnswerChildren;
//import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
//import edu.javacourse.studentorder.domain.student.AnswerStudent;
//import edu.javacourse.studentorder.domain.wedding.AnswerWedding;

public class StudentOrderValidator {
    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {

        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    public void checkAll() {
        List<StudentOrder> soList = readStudentOrders();
        for(StudentOrder so: soList) {
            System.out.println();
            checkOneOrder(so);
        }
    }

        public List<StudentOrder> readStudentOrders () {
            List<StudentOrder> soList = new LinkedList<>();
            for (int i = 0; i<5; i++) {
               StudentOrder so = SaveStudentOrder.buildStudentOrder(i);
               soList.add(so);
            }
            return soList;
        }
public void checkOneOrder(StudentOrder so) {
    AnswerCityRegister cityAnswer = checkCityRegister(so);
    //sentMail(so);
}

   public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so){
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentVal.checkStudent(so);
}

    public void sentMail(StudentOrder so) {
         mailSender.sentMail(so);
    }


}
