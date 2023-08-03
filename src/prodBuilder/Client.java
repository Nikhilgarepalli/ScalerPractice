package prodBuilder;

import prodBuilder.Student;

import java.util.Scanner;

import static prodBuilder.Student.*;

public class Client {
    public static void main(String[] args) {
        Student.StudentBuilder sb = getBuilder();

        sb.name="Nikhil";
        sb.age=25;
        sb.universityName="CBIT";
        sb.address="Hyderabad";
        sb.gradYear = "2021";
        sb.cgpa=6.7;

       // Student st = b.build();

        //prodBuilder.Student st = new Student(builder);

        System.out.println("Debug");
    }
}

