import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConnection {

	public static void main(String[] args) {
		
		try {
			String dburl="jdbc:mysql://localhost:3306/jdbc";
			Connection con=DriverManager.getConnection(dburl, "root", "root");
			
			String Query="select*from student ";
			PreparedStatement stmt=con.prepareStatement(Query);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String gmail=rs.getString(3);
				System.out.printf("Id:%d%n Name:%s%n Gmail: %s%n Dept: %s%n:",id,name,gmail);
				
				// println
				// printf, print -> System.out.print();
				// System -> class -> java.util.S
			}
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
