package in.test.create;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
✅ Step-by-Step: Add External JAR to IntelliJ Project
For a standard Java project (non-Maven/Gradle):

    Open Your Project in IntelliJ IDEA.

    Go to File > Project Structure (or press Ctrl + Alt + Shift + S).

    In the Project Structure window:

        Select "Modules" from the left panel.

        Select your module (usually named after your project).

    Click the "Dependencies" tab on the right.

    Click the "+" button (top right) > Select "JARs or directories…".

    Browse and select the external JAR file you want to add.

    After selecting the JAR:

        Choose "Classes" if asked.

        The JAR will now appear in the list of dependencies.

    Click "Apply" and then "OK".

    Now your external library is added — you can import and use it in your code!
 */
public class InsertApp {
    public static void main(String[] args) {
        try {
            String name = "Anindita";
            String email = "Anee@gmail.com";
            String password = "Anee@123";
            String gender = "Female";
            String city = "Kolkata";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
//            PreparedStatement ps = con.prepareStatement("insert into register values('kunal','kunal@gmail.com','kunal','Male','Patna')");
            PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2,email);
            ps.setString(3,password);
            ps.setString(4,gender);
            ps.setString(5,city);
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Success");
            } else {
                System.out.println("Fail");
            }
//            System.out.println("Success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
