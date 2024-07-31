package Cazare;

import java.sql.*;

public class Sql {
    private Connection conn;
    private Statement st;

    public Sql() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/date_studenti", "root", "");
            this.st = conn.createStatement();
        } catch (Exception e) {
            System.out.println("Connection to the database failed.");
            System.exit(0);
        }
    }

    public void insertDataIntoDatabase(String nume, String prenume, String facultate, String specializare, String cnp, String adresa, String tipstudii, String an) {
        String sql = "INSERT INTO date studenti (Nume, Prenume, Facultate, Specializare, CNP, Adresa, Tip_Studii, An) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            // Set values for the parameters
            statement.setString(1, nume);
            statement.setString(2, prenume);
            statement.setString(3, facultate);
            statement.setString(4, specializare);
            statement.setString(5, cnp);
            statement.setString(6, adresa);
            statement.setString(7, tipstudii);
            statement.setString(8, an);

            // Execute the statement
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
