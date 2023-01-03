import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {

	public void database(List<Vehicle> vehicles) throws Exception {
		String url = "sqlite-jdbc-3.40.0.0-javadoc.jar";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		Statement stat = conn.createStatement();
		
		stat.executeUpdate("dro table if exists database;");
		stat.executeUpdate("create table database (brand, model);");
		
		
		List<Vehicle> List = new ArrayList<>();
		List=vehicles;
		PreparedStatement prep = conn.prepareStatement("insert into database value(?,?);");
		for(Vehicle vehicle: List) {
			prep.setString(2, vehicle.getBrand());
			prep.setString(3, vehicle.getBrand());
			prep.setInt(4, 200000);
			
			
		}
		
		
		
		ResultSet rs = stat.executeQuery("select brand from  database;");
		while (rs.next()) {
			System.out.println(rs.getString(2));
		}
		rs.close();
		conn.close();
	}

}

