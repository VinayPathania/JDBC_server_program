package ev4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Course {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 5;
        for (int i = 0; i < d; i++) {
            System.out.println("Enter Course id :");
            int cid = sc.nextInt();

            System.out.println("Enter Course name :");
            String cname = sc.next();

            System.out.println("Enter Course fee :");
            int fee = sc.nextInt();

            System.out.println("Enter Course Duration :");
            String duration = sc.next();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("problem with loading the driver related main class");
            }


            String url = "jdbc:mysql://localhost:3306/sb101";


            try (Connection conn = DriverManager.getConnection(url, "root", "root")) {
                String sql = "select * from department";
                System.out.println(sql);

                Statement st = conn.createStatement();

                System.out.println("Enter department detail");

                int x = st.executeUpdate("insert into course values(" + cid + ",'" + cname + "','" + fee + "','" + duration + "')");

                if (x > 0) {
                    System.out.println("record inserted successfully..!");
                } else
                    System.out.println("not inserted..");


            } catch (SQLException e) {

                e.printStackTrace();
                System.out.println(e.getMessage());
            }

        }
    }
}
