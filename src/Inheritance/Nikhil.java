package Inheritance;

public class Nikhil extends Upender{

    public void N()
    {
        System.out.println("Nikhil class");
        System.out.println();
    }
    public void G()
    {
        System.out.println("Garepalli from Nikhil class");
        System.out.println();
    }

    @Override
    public void U() {
        System.out.println("Upender class from Nikhil class");
        System.out.println();
    }
}
