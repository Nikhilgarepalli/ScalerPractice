package Inheritance;

public class Main {
    public static void main(String[] args) {
        Garepalli g = new Nikhil();
        Nikhil n = new Nikhil();
        Upender u = new Upender();


        u.G();
        Garepalli n1 = new Upender();
        n1.G();
        n1.U();


    }
}
