import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class ReadCSV {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/tta";
        String username = "root";
        String password = "root";
 
       // String csvFilePath = "student.txt";// for text file
       String csvFilePath = "student.csv";//for csv file
 
 
        Connection con = null;
 
        try {
 
            con = DriverManager.getConnection(URL, username, password);
            Statement statement = con.createStatement();

            //file reading using buffer
            BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
            String lineText = null;
 
            int count = 0;//row count
 
            lineReader.readLine(); // skip header line
 
            while ((lineText = lineReader.readLine()) != null) {
               
                String[] data = lineText.split(",");// String array -> collect all String of row
                String sid = data[0];
                String firstName = data[1];
                String lastName = data[2];
                String score = data[3];
                

            String sql = "INSERT INTO student (sid, firstName, lastName, score) VALUES ("+sid+", '"+firstName+"', '"+lastName+"', "+score+")";
 
            statement.executeUpdate(sql);
            count++;
            
            }
 
            lineReader.close();// close buffer after reading
            System.out.println("Total row inserted :"+count);
            
            con.close();//closing db connection
 
        } catch (Exception ex) {
            System.err.println(ex);
        
        }
 
    }
}
