package homeworks.lesson6;

import java.time.LocalDate;

public class Student extends Person {

    private String Faculty;
    private int GraduateYear;

    public Student(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public int getGraduateYear() {
        return GraduateYear;
    }

    public void setGraduateYear(int graduateYear) {
        GraduateYear = graduateYear;
    }
}
