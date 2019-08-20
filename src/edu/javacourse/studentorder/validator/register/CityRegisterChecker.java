package edu.javacourse.studentorder.validator.register;

import edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.exception.TransportException;

import javax.xml.transform.TransformerException;

public interface CityRegisterChecker {
    CityRegisterResponse checkPerson (Person person) throws CityRegisterException, TransportException;
}
