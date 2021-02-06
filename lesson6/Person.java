package homeworks.lesson6;

import java.time.LocalDate;

public class Person {

    private String FirstName;
    private String LastName;
    private java.time.LocalDate BirthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        FirstName = firstName;
        LastName = lastName;
        BirthDate = birthDate;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        BirthDate = birthDate;
    }
}
