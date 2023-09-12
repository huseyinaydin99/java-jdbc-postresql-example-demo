package tr.com.huseyinaydin;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT * FROM PRODUCT WHERE PRODUCT_ID = 1;";
        String url = "jdbc:postgresql://localhost:5432/huseyin_db";
        String username = "postgres";
        String password = "postgres";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        System.out.println(resultSet.getString(1));
        resultSet.close();
        statement.close();
        connection.close();
    }
}