package oops.designPatterns.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlExecutor {

    private final Connection connection;

    public SqlExecutor(final SqlConnection sqlConnection){
        this.connection = sqlConnection.getConnection();
    }

    public ResultSet execute(final String sql) throws SQLException {
        return connection.createStatement().executeQuery(sql);
    }
}
