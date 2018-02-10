import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;
public class Item2 {
	private static final String COMMA_DELIMITER = ","; 
	private static final String NEW_LINE_SEPARATOR = "\n"; 
	 public void PassToDatabase()  throws IOException{
		 String date, URL, quality,method,month;
try{
			FileWriter fw = null;
			String lin = "";
			fw = new FileWriter("data_large.csv");
			InputStream fileStream = new FileInputStream("largelogs");
			Reader decoder = new InputStreamReader (fileStream);
			BufferedReader bf = new BufferedReader(decoder);
			while ((lin = bf.readLine()) != null){
				try{
					String[] myline=lin.split("\\s+");
					
				URL=myline[4];
				quality=myline[10];
				date=myline[0];
				month=myline[0].substring(0,7);
				method=myline[3];
				}
				catch(StringIndexOutOfBoundsException ex){
					 date = " ";
					month=" ";
					 URL =" ";
					 quality = " ";
					 method=" ";
				}catch(ArrayIndexOutOfBoundsException e){
					date = " ";
					month=" ";
					 URL =" ";
					 quality = " ";
					 method=" ";
				}
				if (quality.matches("200")){
					fw.append(String.valueOf(date));
					fw.append(COMMA_DELIMITER);
					fw.append(String.valueOf(month));
					fw.append(COMMA_DELIMITER);
					fw.append(String.valueOf(URL));
					fw.append(COMMA_DELIMITER);
					fw.append(String.valueOf(method));
					fw.append(NEW_LINE_SEPARATOR);
				}
				
			
			}

			System.out.println("----largelogs File written successfully in data_large.csv file----");
}
catch (FileNotFoundException e) {

	System.out.println("----No files present in the given location----");
} catch (IOException e) {
	System.out.println(e);
}

	 }

public void PassToDatabase2()  throws IOException{
		 String date, URL, quality,method,month;
try{
			FileWriter fw = null;
			String lin = "";
			fw = new FileWriter("data_small.csv");
			InputStream fileStream = new FileInputStream("small_logs");
			Reader decoder = new InputStreamReader (fileStream);
			BufferedReader bf = new BufferedReader(decoder);
			while ((lin = bf.readLine()) != null){
				try{
					String[] myline=lin.split("\\s+");
					
				URL=myline[4];
				quality=myline[10];
				date=myline[0];
				month=myline[0].substring(0,7);
				method=myline[3];
				}
				catch(StringIndexOutOfBoundsException ex){
					 date = " ";
					month=" ";
					 URL =" ";
					 quality = " ";
					 method=" ";
					
				}catch(ArrayIndexOutOfBoundsException e){
					date = " ";
					month=" ";
					 URL =" ";
					 quality = " ";
					 method=" ";
					
				}
				if (quality.matches("200")){
					fw.append(String.valueOf(date));
					fw.append(COMMA_DELIMITER);
					fw.append(String.valueOf(month));
					fw.append(COMMA_DELIMITER);
					fw.append(String.valueOf(URL));
					fw.append(COMMA_DELIMITER);
					fw.append(String.valueOf(method));
					fw.append(NEW_LINE_SEPARATOR);
				}
				
			
			}

			System.out.println("----smalllogs File written successfully in data_small.csv file----");
}
catch (FileNotFoundException e) {

	System.out.println("----No files present in the given location----");
} catch (IOException e) {
	System.out.println(e);
}

	 }
public void insertdata() throws SQLException, ClassNotFoundException{
	String myDriver = "com.mysql.jdbc.Driver";
	String myUrl = "jdbc:mysql://localhost:3306/logs";
    Class.forName(myDriver);
    Connection connect = DriverManager.getConnection(myUrl, "root", "jyoti");
	Statement statement = connect.createStatement();
	
	String loadQuery = "LOAD DATA LOCAL INFILE '" + "../src/data_large.csv"
			+ "' INTO TABLE largelog FIELDS TERMINATED BY ','"
			+ " LINES TERMINATED BY '\n' (date,month, URL,method) ";
	statement.execute(loadQuery);
	System.out.println("----The values from small_logs are entered into the tables named largelog----");	
}
public void insertdata2() throws SQLException, ClassNotFoundException{
	String myDriver = "com.mysql.jdbc.Driver";
	String myUrl = "jdbc:mysql://localhost:3306/logs";
    Class.forName(myDriver);
    Connection connect = DriverManager.getConnection(myUrl, "root", "jyoti");
	Statement statement = connect.createStatement();
	
	String loadQuery = "LOAD DATA LOCAL INFILE '" + "../src/data_small.csv"
			+ "' INTO TABLE smalllog FIELDS TERMINATED BY ','"
			+ " LINES TERMINATED BY '\n' (date,month,URL,method) ";
	statement.execute(loadQuery);
	System.out.println("----The values from small_logs are entered into the tables named largelog----");	
}
public static void main(String args[]) throws IOException, ClassNotFoundException, SQLException{
	InsertLogs u = new InsertLogs();
	u.PassToDatabase();
	u.PassToDatabase2();
	u.insertdata();
	u.insertdata2();
	
}
}
