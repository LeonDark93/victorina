package com.victorina.java;

import java.util.Objects;
import java.util.Scanner;

public class Controllers {

     int countPlusAnswers = 0;
     int allQuestions = 10;

    GetConnectionDB getConn = new GetConnectionDB();

    void sayGreetings() {
        System.out.println("::::::::: Добро пожаловать на Викторину чтобы проверить свои знания :::::::::");
    }

    void printMainMenu() {
        Scanner input = new Scanner(System.in);
        boolean isRepeatApp = true;
        while (isRepeatApp) {
            System.out.println("Главное меню программы");
            System.out.println("1.Начать Викторину");
            System.out.println("2.Выход из Викторину");
            System.out.println("Введите номер опции:");
            char choseOption = input.next().charAt(0);
            switch (choseOption) {
                case '1':
                    getConn.tryCatchConnectionDB();
                    allQuestions();
                    isRepeatApp = false;
                    break;
                case '2':
                    System.out.println("Всего Хорошего!!!");
                    isRepeatApp = false;
                    break;
                default:
                    System.out.println("Unknown Error!");
            }

        }

    }






    void allQuestions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("   Вопрос"   );
        getConn.getQuestionsById(1);
        System.out.println("Ваш ответ:");
    if (sc.next().equals(getConn.getAnswerById(1))){
        System.out.println("Правильно!");
        countPlusAnswers ++;
    } else System.out.println("Неправильный ответ!");


        System.out.println("   Вопрос"   );
        getConn.getQuestionsById(2);
        System.out.println("Ваш ответ:");
        if (sc.next().equals(getConn.getAnswerById(2))){
            System.out.println("Правильно!");
            countPlusAnswers ++;
        } else System.out.println("Неправильный ответ!");

        System.out.println("   Вопрос"   );
        getConn.getQuestionsById(3);
        System.out.println("Ваш ответ:");
        if (sc.next().equals(getConn.getAnswerById(3))){
            System.out.println("Правильно!");
            countPlusAnswers ++;
        } else System.out.println("Неправильный ответ!");

        System.out.println("   Вопрос"   );
        getConn.getQuestionsById(4);
        System.out.println("Ваш ответ:");
        if (sc.next().equals(getConn.getAnswerById(4))){
            System.out.println("Правильно!");
            countPlusAnswers ++;
        } else System.out.println("Неправильный ответ!");

        System.out.println("   Вопрос"   );
        getConn.getQuestionsById(5);
        System.out.println("Ваш ответ:");
        if (sc.next().equals(getConn.getAnswerById(5))){
            System.out.println("Правильно!");
            countPlusAnswers ++;
        } else System.out.println("Неправильный ответ!");

        System.out.println("   Вопрос"   );
        getConn.getQuestionsById(6);
        System.out.println("Ваш ответ:");
        if (sc.next().equals(getConn.getAnswerById(6))){
            System.out.println("Правильно!");
            countPlusAnswers ++;
        } else System.out.println("Неправильный ответ!");

        System.out.println("   Вопрос"   );
        getConn.getQuestionsById(7);
        System.out.println("Ваш ответ:");
        if (sc.next().equals(getConn.getAnswerById(7))){
            System.out.println("Правильно!");
            countPlusAnswers ++;
        } else System.out.println("Неправильный ответ!");

        System.out.println("   Вопрос"   );
        getConn.getQuestionsById(8);
        System.out.println("Ваш ответ:");
        if (sc.next().equals(getConn.getAnswerById(8))){
            System.out.println("Правильно!");
            countPlusAnswers ++;
        } else System.out.println("Неправильный ответ!");

        System.out.println("   Вопрос"   );
        getConn.getQuestionsById(9);
        System.out.println("Ваш ответ:");
        if (sc.next().equals(getConn.getAnswerById(9))){
            System.out.println("Правильно!");
            countPlusAnswers ++;
        } else System.out.println("Неправильный ответ!");

        System.out.println("   Вопрос"   );
        getConn.getQuestionsById(10);
        System.out.println("Ваш ответ:");
        if (sc.next().equals(getConn.getAnswerById(10))){
            System.out.println("Правильно!");
            countPlusAnswers ++;
        } else System.out.println("Неправильный ответ!");


        System.out.println("Всего правильных ответов = " + countPlusAnswers);
        System.out.println("Неправильных = ");
        System.out.print(allQuestions - countPlusAnswers);
    }

}
