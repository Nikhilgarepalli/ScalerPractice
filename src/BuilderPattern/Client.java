package BuilderPattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Helper helper = new Helper();

        helper.name = "Nikhil";
        helper.age = 25;
        helper.universityName="CBIT";

        Student st = new Student(helper);

        System.out.println("Debug");
    }
}
