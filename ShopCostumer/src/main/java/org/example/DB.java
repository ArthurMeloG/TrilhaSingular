package org.example;

import org.example.Entity.Factory;
import org.example.Entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DB {
    private  String url = "jdbc:postgresql://localhost:49153/shop";
    private  String user = "postgres";
    private  String password = "postgrespw";

    public <T> Optional<List<T>> execute(String query, Factory factory)  {
        List<T> listResponse = new ArrayList<>();
        Optional<ResultSet> resultSet;
        try (Connection c = DriverManager.getConnection(url, user, password)) {
            Statement statement = c.createStatement();
            resultSet = Optional.ofNullable(statement.executeQuery(query));

            if(resultSet.isPresent()) {
                while(resultSet.get().next()) {
                    T responseModel = factory.createDTO(resultSet.get());
                    listResponse.add(responseModel);
                }
            }
            statement.close();

            return Optional.of(listResponse);
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
        return Optional.empty();
    }


}
