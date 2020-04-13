package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DatabaseHandler extends Configs{
    Connection dbConnection;
    public Connection getDbConnection () throws ClassNotFoundException, SQLException{
        String connectionString = "jdbc:mysql://"+ dbHost+ ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString,
                "root","12345" );
        return dbConnection;
    }

public void signUpUser(String firstName,String lastName,String userName,
                       String password, String location, String gender){
    String insert = "INSERT INTO "+ Const.USER_TABLE+ "("+ Const.USER_FIRSTNAME+ "," +
            Const.USER_LASTNAME+ ","+ Const.USER_USERNAME+ "," + Const.USER_PASSWORD + ","+ Const.USER_LOCATION+","
            + Const.USER_GENDER+ ")"+ "VALUES(?,?,?,?,?,?)";

    try {
        PreparedStatement prST = getDbConnection().prepareStatement(insert);
        prST.setString(1,firstName);
        prST.setString(2,lastName);
        prST.setString(3,userName);
        prST.setString(4,password);
        prST.setString(5,location);
        prST.setString(6,gender);
        prST.executeUpdate();
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
    }
}
}
