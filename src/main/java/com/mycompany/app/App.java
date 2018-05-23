package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    int x;
    public void foo() {
        x = x;
    }

    private final String message = "Hello Wakanda!!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
