package ev4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter department detail");
        int d = 9;
        for(int i=0; i<d;i++){
            System.out.println("Enter Employee id :");
            int eid= sc.nextInt();

            System.out.println("Enter Employee name :");
            String ename= sc.next();

            System.out.println("Enter Employee address :");
            String address= sc.next();

            System.out.println("Enter Employee mobile :");
            String mobile= sc.next();

            System.out.println("Enter Employee salary :");
            int salary= sc.nextInt();

            System.out.println("Enter Employee dptid :");
            int dptid= sc.nextInt();

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

                int x= st.executeUpdate("insert into employee values("+eid+",'"+ename+"','"+address+"','"+mobile+"',"+salary+","+dptid+")");

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
