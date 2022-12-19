package com.loadcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoadDataToDb {
	
	public static void main(String[] args) {
		
        String jdbc = "jdbc:mysql://localhost:3306/csv_data_upload";
        String username = "root";
        String password = "Nagaraj@1234";

        String csvFilePath ="C:/Users/soniya/Downloads/task1.csv";

        int batchSize = 5;

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(jdbc, username, password);
            connection.setAutoCommit(false);

            String sql = "INSERT INTO sample (id,name,age) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
            String lineText = null;

            int count = 0;

            lineReader.readLine(); // skip header line

            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String id = data[0];
                String name = data[1];
                String age = data[2];
              
             

                statement.setString(1,id );
                statement.setString(2,name);
                statement.setString(3,age );
         

                statement.addBatch();

                if (count % batchSize == 0) {
                    statement.executeBatch();
                }
            }
            System.out.println("Inserted Successfully");
            lineReader.close();

            // execute the remaining queries
            statement.executeBatch();

            connection.commit();
            connection.close();

        } catch (IOException ex) {
            System.err.println(ex);
        } catch (SQLException ex) {
            ex.printStackTrace();

//            try {
//                connection.rollback();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
       
        }

    }

}
