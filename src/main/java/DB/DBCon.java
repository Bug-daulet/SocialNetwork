package DB;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;

public class DBCon {
    private static DBCon instance;

    private DBCon() {}

    public static DBCon getInstance() {
        if (instance == null) {
            instance = new DBCon();
        }
        return instance;
    }

    public Connection getConnection()
    {
        Context initialContext = null;
        Connection connection = null;
        try {
            initialContext = new InitialContext();
            Context envCtx = (Context)initialContext.lookup("java:comp/env");
            DataSource dataSource = (DataSource)envCtx.lookup("jdbc/postgres");
            //DataSource dataSource = (DataSource)initialContext.lookup("java:comp/env/jdbc/postgres");
            connection = dataSource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
