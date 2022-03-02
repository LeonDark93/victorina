package com.victorina.java;

import com.victorina.java.sql.DBDataExtractor;
import connection.MyDbConnection;
import connection.configs.DefaultConfiguration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {
            DBDataExtractor dbDataExtractor = new DBDataExtractor(MyDbConnection.getConnectionBy(new DefaultConfiguration()));

                for(int i = 1; i<=10;i++){

                    String [] question = dbDataExtractor.getQuestion(i);
                    System.out.println(question[DBDataExtractor.QUESTION]);
                    Scanner sc = new Scanner(System.in);

                    if(question[DBDataExtractor.ANSWER].equals(sc.next())){
                        System.out.println("True");

                    } else
                        System.out.println("False");
                }

        }catch (Exception ex){
            ex.printStackTrace();
        }



    }
}
