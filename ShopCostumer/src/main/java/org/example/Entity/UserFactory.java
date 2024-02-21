package org.example.Entity;

import org.example.DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserFactory {

//    public void createUser(User u) {
//        String stringQuery = String.format(
//                "insert into Usershop (name)" +
//                        "values ('%s')", u.name);
//        DB.execute(stringQuery);
//    }

//    public List<User> listAllUsers() throws SQLException {
//        List<User> u = new ArrayList<>();
//        String stringQuery = "SELECT * FROM Usershop";
//        var result = DB.execute(stringQuery);
//        if(result.isPresent()) {
//            while(result.get().next()) {
//                u.add(getUser(result.get()));
//            }
//        }
//        return u;
//    }

    public User getUser(ResultSet resultSet) throws SQLException {
        User u = new User(
                resultSet.getInt("id"),
                resultSet.getString("name"));

        return u;
    }
}
