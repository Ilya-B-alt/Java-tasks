package javaclasses;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student(1111, "Ivanov", "Ivan", "Ivanovich",
                new GregorianCalendar(1999, Calendar.JANUARY, 12), "informatics", "2", "123");
        Student student2 = new Student(1112, "Petrov", "Petr", "Petrovich",
                new GregorianCalendar(1998, Calendar.APRIL, 27), "philology", "1", "122");
        Student student3 = new Student(1113, "Aleksandrov", "Aleksandr", "Aleksandrovich",
                new GregorianCalendar(1998, Calendar.MARCH, 23), "mathematics", "3", "121");
        Student student4 = new Student(1114, "Sidirov", "Ilya", "Ilyich",
                new GregorianCalendar(1998, Calendar.JUNE, 1), "philology", "1", "121");
        Student student5 = new Student(1115, "Smirnov", "Andrei", "Viktorovich",
                new GregorianCalendar(1999, Calendar.DECEMBER, 31), "mathematics", "2", "122");
        Student student6 = new Student(1116, "Andreev", "Artem", "Olegovich",
                new GregorianCalendar(1999, Calendar.SEPTEMBER, 11), "informatics", "3", "123");
        Student student7 = new Student(1117, "Ryazancev", "Victor", "Dmitrievich",
                new GregorianCalendar(1998, Calendar.OCTOBER, 7), "mathematics", "3", "122");
        Student student8 = new Student(1118, "Karpov", "Anatoly", "Evgenievich",
                new GregorianCalendar(1999, Calendar.JULY, 15), "informatics", "2", "121");
        Student student9 = new Student(1119, "Kasparov", "Harry", "Kimovich",
                new GregorianCalendar(1998, Calendar.NOVEMBER, 3), "philology", "1", "123");
        Student student10 = new Student(1120, "Smirnov", "Andrei", "Viktorovich",
                new GregorianCalendar(1999, Calendar.AUGUST, 24), "informatics", "1", "123");

        StudentList studentList = new StudentList();
        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);
        studentList.addStudent(student4);
        studentList.addStudent(student5);
        studentList.addStudent(student6);
        studentList.addStudent(student7);
        studentList.addStudent(student8);
        studentList.addStudent(student9);
        studentList.addStudent(student10);

        studentList.facultyList("philology");
        studentList.groupList("123");
        studentList.dateOfBirth("1998");
        studentList.facultyAndYearOfStudy("mathematics", "2");



    }
}

