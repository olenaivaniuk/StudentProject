package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.register.AnswerCityRegisterItem;
import edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.validator.register.CityRegisterChecker;
import edu.javacourse.studentorder.validator.register.FakeCityRegisterChecker;

import java.util.List;

public class CityRegisterValidator {
    public String hostName;
    public String login;
    int port;
    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.addItem(checkPerson(so.getHusband()));
        ans.addItem(checkPerson(so.getWife()));

            /*for(int i = 0; i<children.size(); i++) {
                CityRegisterCheckerResponse cans = personChecker.checkPerson(children.get(i));
            }
            for(Iterator<Child> it = children.iterator(); it.hasNext();) {
                Child child = it.next();
                CityRegisterCheckerResponse cans = personChecker.checkPerson(child);
            } */
         for(Child child : so.getChildren()) {
                ans.addItem(checkPerson(child));
            }
            return ans;
    }

    private AnswerCityRegisterItem checkPerson(Person person) {
        try {
            CityRegisterResponse cans = personChecker.checkPerson(person);
            }
        catch (CityRegisterException ex){
            ex.printStackTrace(System.out);
        }
        return null;
    }
}

//3 формы
