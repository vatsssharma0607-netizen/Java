import java.sql.*;
public class Assignment16 
{
        static final String DB_URL = "jdbc:mysql://localhost:33060/";
        static final String USER = "root";
        static final String PASS = "root";
        public static void main(String[] args) 
        {
                try 
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");  
                    Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);  
                    Statement stmt = conn.createStatement();
                    String createTable = "CREATE TABLE IF NOT EXISTS Students ("+Roll_No+" INT PRIMARY KEY, Name VARCHAR(50),Percentage DOUBLE)";
                    stmt.executeUpdate(createTable);
                    System.out.println("Table created successfully");
                    String insert = "INSERT INTO Student(Roll_No, Name, Percentage)VALUES(101,'Amit',85.5)";
                    stmt.executeUpdate(insert);
                    System.out.println("Record Inserted Successfully.");
                    String select ="SELECT Roll_No, Name FROM Student WHERE Percentage > 70";
                    ResultSet rs = stmt.executeQuery(select);
                    System.out.println("\nStudents having Percentage > 70");
                    System.out.println("------------------------------");
                    while(rs.next())
                    {
                        System.out.println("Roll No : "+ rs.getInt("Roll_No"));
                        System.out.println("Name :"+ rs.getString("Name"));
                        System.out.println();
                    }
                    rs.close();
                    stmt.close();
                    con.close();
                } 
                catch(Exception e)
                {
                    System.out.println(e);
                }
        }
}