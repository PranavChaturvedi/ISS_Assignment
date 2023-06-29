import java.sql.*;
import java.util.Scanner;

public class JDBCMethods {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","pranavC123@");
            Statement statement = con.createStatement();

            //Creating a table
            /*
            String createTable = "CREATE TABLE student (sid int(10) PRIMARY KEY,sname varchar(20),sphone varchar(20),scity varchar(20));";
            statement.execute(createTable);
            */

            //Inserting values into table
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Student ID : ");
            int a = sc.nextInt();sc.nextLine();
            System.out.println("Enter Student Name : ");
            String b = sc.nextLine();
            System.out.println("Enter Student Phone : ");
            String c = sc.nextLine();
            System.out.println("Enter Student City : ");
            String d = sc.nextLine();
            String enterData = "INSERT INTO student(sid,sname,sphone,scity) VALUES (?,?,?,?);";
            PreparedStatement enterDataPrepared = con.prepareStatement(enterData);
            enterDataPrepared.setInt(1,a);
            enterDataPrepared.setString(2,b);
            enterDataPrepared.setString(3,c);
            enterDataPrepared.setString(4,d);
            enterDataPrepared.executeUpdate();

            //Seeing all values from a table
            String allRows = "SELECT * FROM student";
            ResultSet result = statement.executeQuery(allRows);
            while(result.next()){

                int id = result.getInt("sid");
                String name = result.getString("sname");
                String phone = result.getString("sphone");
                String city = result.getString("scity");

                System.out.println("ID : " + id);
                System.out.println("Name : " + name);
                System.out.println("Phone No. : " + phone);
                System.out.println("City : " + city);
                System.out.println("----------------------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
