import java.sql.*; 
public class connectURL {
	public static void main(String[] args) { 
		//conexion
		 String connectionUrl = "jdbc:sqlserver://10.11.9.49;" + 
		         "databaseName=lab09;user=operador;password=operador"; 
		 //objetos
		  Connection con = null; 
	      Statement stmt = null; 
	      ResultSet rs = null; 
	      try { 
	     
	    	  //iniciar driver
	          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
	          con = DriverManager.getConnection(connectionUrl); 
	  
	        //query
	          String SQL = "SELECT  * FROM persona"; 
	          stmt = con.createStatement(); 
	          rs = stmt.executeQuery(SQL); 
	  
	      
	          while (rs.next()) { 
	             System.out.println(rs.getString(1) + " " + rs.getString(2)); 
	          } 
	       } 
	  

	       catch (Exception e) { 
	          e.printStackTrace(); 
	       } 
	       finally { 
	          if (rs != null) try { rs.close(); } catch(Exception e) {} 
	          if (stmt != null) try { stmt.close(); } catch(Exception e) {} 
	          if (con != null) try { con.close(); } catch(Exception e) {} 
	       } 
	    } 
	
	}