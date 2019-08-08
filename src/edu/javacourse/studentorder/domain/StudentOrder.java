package edu.javacourse.studentorder.domain;

public class StudentOrder {
    private long studentOrderId;
    private AnswerStudent.Adult husband;
    private AnswerStudent.Adult wife;
    private Child child;

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public AnswerStudent.Adult getHusband() {
        return husband;
    }

    public void setHusband(AnswerStudent.Adult husband) {
        this.husband = husband;
    }

    public AnswerStudent.Adult getWife() {
        return wife;
    }

    public void setWife(AnswerStudent.Adult wife) {
        this.wife = wife;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
