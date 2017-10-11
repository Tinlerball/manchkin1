package Db;

import java.sql.*;

/**
 * Created by mikhailovra on 08.10.2017.
 */
public class Db {
    private Connection connection;
    public void connect() throws SQLException, ClassNotFoundException {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String login = "postgres";
            String password = "root";
            Connection con = DriverManager.getConnection(url, login, password);
            setConnection(con);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
