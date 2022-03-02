package com.victorina.java;

public class ConnectionStrings {
    private String user_test_db = "user_leonid_db";
    private String password_test_db = "root1993";
    private String url_test_db = "jdbc:mysql://127.0.0.1:3306/victorina_test_db";

    public String getUser_test_db() {
        return user_test_db;
    }

    public void setUser_test_db(String user_test_db) {
        this.user_test_db = user_test_db;
    }

    public String getPassword_test_db() {
        return password_test_db;
    }

    public void setPassword_test_db(String password_test_db) {
        this.password_test_db = password_test_db;
    }

    public String getUrl_test_db() {
        return url_test_db;
    }

    public void setUrl_test_db(String url_test_db) {
        this.url_test_db = url_test_db;
    }
}
