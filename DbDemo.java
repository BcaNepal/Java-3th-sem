/*database name: jmc

create database jmc;

CREATE TABLE Student(
    roll_no VARHCAR(5),
    student_name VARHCAR(50),
    float age
)*/

//xampp or wampp or mysql
import java.sql.*;


public class DbDemo{
    Connection con;
    Statement stmt;
    ResultSet rs; 

    public void displayStudents(){
        try{
            // 1) load the driver
            Class.forName("com.mysql.jdbc.j.Driver");
            //2) Establish (open) the connection
            con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/jmc", "root", "");            
            stmt = con.createStatement();
            //String sql = "INSERT INTO Student VALUES('s-103', 'Hari Bdr', 23.6)";
            //String sql = DELETE FROM Student WHERE roll_no='s-103';
            String sql = "UPDATE Student student_name='Geeta Rai', age=21.7 WHERE roll_no='s-103'";
            //rs = stmt.executeQuery("SELECT * FROM Student");          
            int i = stmt.executeUpdate(sql);
            //System.out.println(i + " row(s) added";
            //System.out.println(i + " student(s) deleted";
            System.out.println(i + " student(s) updated";
                    String rollNo = rs.getString(1);
                String studentName = rs.getString(2);
                float age = rs.getFloat("age");
                System.out.println("Roll No: " + rollNo);                
                rs.close();
                con.close();
            }*/
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{           
           rs = null;
           con = null;
        }
       // String rollNo =;
       // System.out.println("Roll No: " + rollNo);
    }
    public static void main(String[] args){

    }
}