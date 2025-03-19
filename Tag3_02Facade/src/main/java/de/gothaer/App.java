package de.gothaer;

import de.gothaer.db.Table;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        /*
        //Class.forName("org.h2.Driver").getConstructor().newInstance();
        Connection connection = DriverManager.getConnection("jdbc:h2:c:/tmp/gothaer;AUTO_SERVER=TRUE","sa","");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from tbl_personen");
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

        for(int column = 1; column <= resultSetMetaData.getColumnCount(); column++) {
            System.out.printf("%-30s",resultSetMetaData.getColumnName(column) );
        }
        System.out.println();

        while(resultSet.next()) {
            for(int column = 1; column <= resultSetMetaData.getColumnCount(); column++) {
                System.out.printf("%-30s",resultSet.getString(column) );
            }
            System.out.println();
        }


        resultSet.close();
        statement.close();
        connection.close();
        System.out.println( "Hello World!" );


         */

        try(Table table = new Table("select * from tbl_personen")) {

        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
