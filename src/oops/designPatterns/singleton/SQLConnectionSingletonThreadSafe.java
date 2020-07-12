package oops.designPatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Thread safe singleton implementation of SQL Connection class
 *
 * @author rajatgoyal715
 */
public class SQLConnectionSingletonThreadSafe {

    private static SQLConnectionSingletonThreadSafe instance = null;
    private static Connection connection = null;

    private SQLConnectionSingletonThreadSafe() {
        if (instance != null) {

            throw new RuntimeException("Use getInstance method!");
        }
    }

    public static SQLConnectionSingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SQLConnectionSingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new SQLConnectionSingletonThreadSafe();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if (connection == null) {
            String connectionUrl = "jdbc:mysql://localhost:3306/development";
            try {
                connection = DriverManager.getConnection(connectionUrl, "root", "");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
