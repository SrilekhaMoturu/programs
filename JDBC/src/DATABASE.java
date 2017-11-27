import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DATABASE {
	public static void main(int id,String name,String street,String city,String state,int ZIP) {
		String insertQuery= "Insert into coffeeshop.suppliers(SUP_ID,SUP_NAME,STREET,CITY,STATE,ZIP)"
		 + "values (?,?,?,?,?)";
		try 
		{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop","root","root");
			PreparedStatement PreparedStatement = connection.prepareStatement(insertQuery);
			
			PreparedStatement.setInt(1, id);
			PreparedStatement.setString(2,name);
			PreparedStatement.setString(3, street);
			PreparedStatement.setString(4,city);
			PreparedStatement.setString(5,state);
			PreparedStatement.setInt(6,ZIP);
			
			int noofRows = PreparedStatement.executeUpdate();
			
			if(noofRows == 1)
			{
				System.out.println("record added successfully");
			}
		connection.close();		
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		}
	
	}






