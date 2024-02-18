package org.example;

import java.sql.*;
import java.util.Optional;

public class DB {
    private static String url = "jdbc:postgresql://localhost:49153/shop";
    private static String user = "postgres";
    private static String password = "postgrespw";

    public static Optional<ResultSet> execute(String query)  {
        Optional<ResultSet> resultSet;
        try (Connection c = DriverManager.getConnection(url, user, password)) {
            Statement statement = c.createStatement();
            resultSet = Optional.ofNullable(statement.executeQuery(query));
            return resultSet;
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
