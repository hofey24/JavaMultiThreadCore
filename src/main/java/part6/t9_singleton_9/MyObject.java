package part6.t9_singleton_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author hofey
 **/
public enum MyObject {
    connectionFactory;

    private Connection connection;

    private MyObject()
    {
        try {
            System.out.println("调用了MyObject的构造");
            String url ="jdbc:mysql://172.16.200.156:3306/mlkddsp?autoReconnect=true&useSSL=false&characterEncoding=utf8";
            String username = "root";
            String password = "@#Mlk2023!`";
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            connection = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection()
    {
        return connection;
    }
}
