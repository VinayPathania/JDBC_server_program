package ev4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Department {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int d = 4;
        for(int i=0; i<d;i++){
            System.out.println("Enter Department id :");
            int did= sc.nextInt();

            System.out.println("Enter department name :");
            String dname= sc.next();

            System.out.println("Enter department location :");
            String location= sc.next();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("problem with loading the driver related main class");
            }


            String url = "jdbc:mysql://localhost:3306/sb101";



            try(Connection  conn=  DriverManager.getConnection(url, "root", "root")) {
                String sql = "select * from department";
                System.out.println(sql);

                Statement st= conn.createStatement();

                System.out.println("Enter department detail");

                int x= st.executeUpdate("insert into department values("+did+",'"+dname+"','"+location+"')");

                if(x > 0) {
                    System.out.println("record inserted successfully..!");
                }
                else
                    System.out.println("not inserted..");



            }catch(SQLException e) {

                e.printStackTrace();
                System.out.println(e.getMessage());
            }

        }





    }
}
