import java.sql.*;

public class lec2_to_add {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
                String url="jdbc:mysql://localhost:3306/college";
                String username="root";
                String pass="shreya@123bajaj";
                int roll_no=123;
                String name="Rakshit";
//                String query="insert into student values (110,'rakshit',56,'st','jmp')";
//                String query="insert into student values ("+ roll_no+",'"+name+"',56,'st','jmp')";
                    String query ="insert into student values(?,?,?,?,?)";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection(url,username,pass);//class drivermanager  -> getconnextion class which is static method returns connection
//                Statement st = con.createStatement();  //prepared statement is used when we have values not in the form of statement rater values are taken
                PreparedStatement st= con.prepareStatement(query);  //prepared statement is used when we have values not in the form of statement rater values are taken
                st.setInt(1,345);
                st.setString(2,"dipali");   //parameterindex is questionmark no
                st.setInt(3,12);
                st.setString(4,"ert");
                st.setString(5,"bgp");
//                int count=st.executeUpdate(query);   // returns the number of columns affected i.e, changes took place
                int count=st.executeUpdate();   // returns the number of columns affected i.e, changes took place
        System.out.println(count+" rows affected");

                st.close();
                con.close();

            }
        }



