package connection.configs;

import connection.ConnectionConfig;

public class CustomConfiguration implements ConnectionConfig {

    private String dbUserName;
    private String dbPassword;
    private String dbUrl;

    public void setDbUserName (String dbUserName) {
        this.dbUserName = dbUserName;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public String getUserName() {
        return this.dbUserName;
    }

    @Override
    public String getPassword() {
        return this.dbPassword;
    }

    @Override
    public String getUrl() {
        return this.dbUrl;
    }
}
