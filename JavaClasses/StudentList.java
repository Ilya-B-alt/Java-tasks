package javaclasses;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class StudentList {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void facultyList(String faculty) {
        for (Student s : students) {
            if (s.getFaculty().equals(faculty)) {
                System.out.println(s);
            }
        }
    }

    public void groupList(String group) {
        for (Student s : students) {
            if (s.getGroup().equals(group)) {
                System.out.println(s);
            }
        }
    }

    //Переделал реализацию, теперь работает для любого формата дат
    public void dateOfBirth(String year) {

        for (Student s : students) {
            if ((s.getDateOfBirth().get(Calendar.YEAR)) > Integer.parseInt(year)) {
                System.out.println(s);
            }
        }
    }

    public  void facultyAndYearOfStudy (String faculty, String yearOfStudy) {
        for (Student s : students) {
            if (s.getFaculty().equals(faculty) && s.getYearOfStudy().equals(yearOfStudy)) {
                System.out.println(s);
            }
        }
    }
}

