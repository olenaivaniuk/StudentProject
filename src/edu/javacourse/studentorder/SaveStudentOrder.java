package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.AnswerStudent;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main (String[] args) {
        buildStudentOrder();

        //StudentOrder so = new StudentOrder();
        //long ans = saveStudentOrder(so);
        //System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: ");
        return answer;
    }

    public static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();
        Adult hauband = new Adult();
                
        /*husband.setGivenName("Jack");
        husband.setSurName("Wimmer");
        husband.setPassportNumber("5255222");
        so.setHusband(husband);

        String ans = husband.getPersonString();
        System.out.println(ans); */
        return so;


    }
}
