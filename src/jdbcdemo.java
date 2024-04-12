import java.sql.*;
public class jdbcdemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/college";
        String username="root";
        String pass="shreya@123bajaj";
        String query="insert into student values (110,'rakshit',56,'st','jmp')";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,username,pass);//class drivermanager  -> getconnextion class which is static method returns connection
        Statement st = con.createStatement();  //statement is also an interface so we use createstatement which return the object of statement
        ResultSet rs=st.executeQuery(query);   //resultset has power to store data in the tabular form
//        rs.next();  //this is to move the pointer from the column heading to column data
////        String name=rs.getString("name");  //has to mention the column name you want to extract
//        String userData =rs.getInt(1)+" "+rs.getString(2);
//        rs.next();
//        System.out.println(userData);
//
//        String userData1 =rs.getInt(1)+" "+rs.getString(2);
////        System.out.println(name);
//        System.out.println(userData1);
        while(rs.next()){
            String userData =rs.getInt(1)+" "+rs.getString(2);
            System.out.println(userData);
        }

        st.close();
        con.close();

    }
}
