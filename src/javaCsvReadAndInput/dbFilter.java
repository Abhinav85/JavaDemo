package javaCsvReadAndInput;

import java.sql.*;

public class dbFilter {

    String url = "jdbc:mysql://localhost:3306/ifscdata?useSSL=false";
    String user = "root";
    String password = "root";

    void dbfil (String a){
        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            String query = "SELECT * from ifsccode where IFSC = '" + a + "'";
//            System.out.println(myStmt.executeQuery(query));
            ResultSet myRes = myStmt.executeQuery(query);
            while (myRes.next()) {
                System.out.println(myRes.getString("Bank") + " " + myRes.getString("IFSC") + " " + myRes.getString("Branch"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
