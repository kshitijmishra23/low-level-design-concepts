package oops.designPatterns.singleton;

import java.sql.Connection;

public interface SqlConnection {
    Connection getConnection();
}
