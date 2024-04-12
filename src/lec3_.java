import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class lec3_{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("student");   //it is used to load the class
        Class.forName("com.mysql.jdbc.Driver") ; //static block of driver class ..it loads the driver
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());   //statement use to register driver for what so ever driver we are using
    }
}
class student{
    static{
        System.out.println("i am in static");
    }
    //instance
    {
        System.out.println("i am in instance");
    }
}