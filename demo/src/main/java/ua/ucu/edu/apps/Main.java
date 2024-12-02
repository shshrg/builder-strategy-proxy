package ua.ucu.edu.apps;

import ua.ucu.edu.apps.task1.Student;

public class Main {
    public static void main(String[] args) {
        // User.builder().age(18).name("HelloWorld").gender(Gender.MALE).mouse("MickeyMouse").mouse("Jerry");
        Student student = Student.builder().firstName("Oleksandra")
                                              .mark(90)
                                              .mark(100)
                                              .mouse("MickeyMouse")
                                              .mouse("Jerry")
                                              .build();
        System.out.println(student.toString());
    }
}