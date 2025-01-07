import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDBConnection {

	public static void main(String[] args) {
		String dbUrl = "jdbc:sqlite:E:\\IAAAOPSData\\SQLite_Config.db";
		try {
			Connection connection = DriverManager.getConnection(dbUrl);
			String updateSQL = "UPDATE TMS_SETTINGS_CODE SET value = ? WHERE CODE_ID = ?";

			PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);

			// Set the parameter values for the query
			preparedStatement.setString(1, "Y"); // Set the value to 'Y'
			preparedStatement.setString(2, "ENABLE_TIOT_LOG"); // Set CODE_ID to 'ENABLE_TIOT_LOG'

			// Execute the update
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Rows updated: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace(); // Handle any SQL errors
		}
	}

}
