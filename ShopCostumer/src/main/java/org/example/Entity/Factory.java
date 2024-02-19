package org.example.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Factory {

    public <T> T createDTO(ResultSet resultSet) throws SQLException;
}
