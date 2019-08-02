public class StudentOrderValidator {

    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder so = readStudentOrder();
        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding wedAnswer = checkWedding(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);

        checkCityRegister(so);
        checkWedding(so);
        checkChildren(so);
        checkStudent(so);
        sentMail(so);
        }

        static StudentOrder readStudentOrder () {
        StudentOrder so = new StudentOrder();
        return so;
        }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("cityRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("checkWedding is running");
        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrder so){
        System.out.println("checkChildren is running");
    return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("checkStudent is running");
        return new AnswerStudent();
    }

    static void sentMail(StudentOrder so) {} ;
}
