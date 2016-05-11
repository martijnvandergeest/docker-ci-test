package com.qualogy.dockercitest;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world! Printing program arguments:");
        for (String s : args) {
            System.out.println(" - " + s);
        }
    }
}
