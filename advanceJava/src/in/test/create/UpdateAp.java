package in.test.create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateAp {
    public static void main(String[] args){

        try {
            String city = "pune";
            String name = "Anindita";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
            PreparedStatement ps = con.prepareStatement("update register set city=? where name=?");
            ps.setString(1,city);
            ps.setString(2,name);
            int result = ps.executeUpdate();
            if (result > 1){
                System.out.println("Success");
        }
            else{
                System.out.println("Failed");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
