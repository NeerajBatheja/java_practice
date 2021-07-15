//database
import java.sql.*;

public class MyJDBC {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","batheJa6271@");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from people");
        while (resultSet.next()){
            System.out.println(resultSet.getString("firstname"));
        }

    }


}

