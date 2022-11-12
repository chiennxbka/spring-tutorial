package org.ali.academy;

public class HelloWorld {

    private String message;

    public HelloWorld() {
        System.out.println("Khoi tao Hello world");
    }

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
