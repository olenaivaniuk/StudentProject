public class SaveStudentOrder {
    public static void main (String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "Jim";
        so.hLastName = "Wilson";
        so.wFirstName = "Sara";
        so.wLastName = "Wilson";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.hFirstName);
        return answer;
    }
}
