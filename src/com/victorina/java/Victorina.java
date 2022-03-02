package com.victorina.java;

public class Victorina {
    public static void main(String[] args) {
        GetConnectionDB getConn = new GetConnectionDB();
        Controllers controllers = new Controllers();
        getConn.tryCatchConnectionDB();
        controllers.sayGreetings();
        controllers.printMainMenu();



    }
}
