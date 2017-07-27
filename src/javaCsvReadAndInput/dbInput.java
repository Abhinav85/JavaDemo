package javaCsvReadAndInput;

import java.sql.*;



public class dbInput {
    String url = "jdbc:mysql://localhost:3306/ifscdata?useSSL=false";
    String user = "root";
    String password = "root";

        public void dbin (String[] a){
            try {
                Connection myConn = DriverManager.getConnection(url, user, password);
                Statement myStmt = myConn.createStatement();
                String query = "insert into ifsccode (Bank,IFSC,Branch,Address,Contact,City,District,State) values ('" + a[0] +
                        "','" + a[1] + "','" + a[2] + "','" + a[3] + "','" + a[4] + "','" + a[5] + "','" + a[6] + "','" + a[7] + "')";

                 myStmt.executeUpdate(query);
                ResultSet myRs = myStmt.executeQuery("select * from ifsccode");
//                while (myRs.next()) {
//                    System.out.println(myRs.getString("id") + " " + myRs.getString("Bank") + " " + myRs.getString("IFSC") + " " + myRs.getString("Address"));
//
//                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }


}
