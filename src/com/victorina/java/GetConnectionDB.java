package com.victorina.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class GetConnectionDB {
    Connection connection;
    ResultSet resultSet;

    void tryCatchConnectionDB() {
        ConnectionStrings conStrings = new ConnectionStrings();
        try {
            connection = DriverManager.getConnection(conStrings.getUrl_test_db(),
                    conStrings.getUser_test_db(), conStrings.getPassword_test_db());
            if(connection == null){
                System.out.println("Connection to DB is not Established!!");

            } //else System.out.println("Successfully.....");
        } catch (Exception ex) {
            System.out.println("Oops Unknown Error!!!!!");
            ex.printStackTrace();
        }

    }

    String getQuestionsById(int id_quest){
        String   listOfQuestions = "";
        try{
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM questions where id_quest = " + id_quest;
             resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                   listOfQuestions = resultSet.getString("title");
               System.out.println(listOfQuestions);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return listOfQuestions;
    }

    String getAnswerById(int id_answers){
        String  listOfAnswers= "";
        try{
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM answers where id_answer = " + id_answers;
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                 listOfAnswers = resultSet.getString("answers");

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return listOfAnswers;
    }



}





