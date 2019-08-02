public class SaveStudentOrder {
    public static void main (String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "Jim";
        so.hLastName = "Wilson";
        so.wFirstName = "Sara";
        so.wLastName = "Wilson";

        StudentOrder so1 = new StudentOrder();
        so1.hFirstName = "Jack";
        so1.hLastName = "Loger";
        so1.wFirstName = "Samanta";
        so1.wLastName = "Loger";

        long ans = saveStudentOrder(so);
        System.out.println(ans);

        long ans1 = saveStudentOrder(so1);
        System.out.println(ans1);

    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.hFirstName);
        return answer;
    }
}
