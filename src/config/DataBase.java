package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
    static String url = "jdbc:mysql:/localhost:3306//qlsv_nh";
    static String user = "root";
    static String password = "";
    public static Connection getConnection(){
        Connection connection = null;
        try {
            System.out.println("Connect thanh cong");
            connection = DriverManager.getConnection(url,user,password);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return connection;
    }
}
