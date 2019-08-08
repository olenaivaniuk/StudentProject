package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.StudentOrder;

public class CityRegisterValidator {
    public String hostName;
    public String login;
    int port;

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("cityRegister is running " + hostName + "," + login );
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
