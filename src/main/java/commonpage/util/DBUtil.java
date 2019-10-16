package commonpage.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * created by San
 * 13-12-2018
 */
public class DBUtil {


    public static void main(String args[]) throws InterruptedException
    {
        //Connected database and fetch values
        try
        {
            // create our mysql database connection
//	    	String userName = "praj";
//	    	String password = "Consova1";
            String userName = "deploy";
            String password = "deploy";

//	    	instance=SANDCASTLE01

            String url = "jdbc:sqlserver://192.168.2.231;databaseName=EVO_PHYSIO_LIVE_DEIDENTIFIED";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, userName, password);

            // our SQL SELECT query.
            // if you only need a few columns, specify them by name instead of using "*"
//	      String query = "SELECT * from Audit.Answers where id=4";

            String query = "SELECT Description from dbo.Assistance where id=1";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next())
            {
                String strName=rs.getString("Description");
//	        int id = rs.getInt("id");
//	        int firstName = rs.getInt("UnitOfMeasureId");
//	        int lastName = rs.getInt("InputOptionTypeId");
//	        int created = rs.getInt("CreatedBy");
//	        Date createdDate = rs.getDate("CreatedDate");
//	        String strModifyBy = rs.getString("ModifyBy");
//	        String Modify=rs.getString("ModifiedDat");

                // print the results
                System.out.format("%s\n",strName);

            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
