
package salarydatabase;

import java.sql.*;

/**
 * Class that connects and transfers information to the database
 * @author Nolan Lowhorn
 */
public class DatabaseConnector {
    private String url;
    private String username;
    private String password;

    /**
     * Default constructor
     */
    public DatabaseConnector() {
    }//end constructor

    /**
     * Constructor with all of the information
     * @param url String - URL of the database
     * @param username String - Username to access the database
     * @param password String - Password to access the database
     */
    public DatabaseConnector(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }//end constructor

    /**
     * Method that creates a table
     * @param table String - The name of the table
     * @param fieldsWithType - The fields of data and their datatype
     */
    public void createTable(String table, String[] fieldsWithType){
        String createQuery = "CREATE TABLE ";
        createQuery += "IF NOT EXISTS ";
        createQuery += table + "(";
        for(int i = 0; i < fieldsWithType.length; i++){
            createQuery += fieldsWithType[i];
            if(i < fieldsWithType.length -1){
                createQuery += ", ";
            }//end if
            else{
                createQuery += ");";
            }//end else
        }//end for
        
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(createQuery);
            statement.close();
            connection.close();
            System.out.println("Success");
        }//end try
        catch(Exception e){
            System.out.println("Can't connect");
        }//end catch
        
    }//end createTable
    
    /**
     * Method that adds data to a table
     * @param table String - The name of the table
     * @param fields String[] - The columns of the table
     * @param values Object[] - The rows of the table
     */
    public void addData(String table, String[] fields, Object[] values){
        String insertQuery = "INSERT INTO "; 
        insertQuery += table + "(";
        for(int i = 0; i< fields.length; i++){
            insertQuery += fields[i];
            if(i < fields.length -1){
                insertQuery += ", ";
            }//end if
            else{
                insertQuery += ") ";
            }//end else
        }//end for
        insertQuery += "VALUES(";
        for(int i=0; i < values.length; i++){
            try{
                int temp = (int)values[i];
                insertQuery += values[i];
            }//end try
            catch(Exception e){
                insertQuery += "\"" + values[i] + "\"";
            }//end catch
            if(i < values.length-1){
                insertQuery += ", ";
            }//end if
            else{
                insertQuery += ");";
            }//end else
        }//end for
        
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertQuery);
            statement.close();
            connection.close();
            System.out.println("Success");
        }//end try
        catch(Exception e){
            System.out.println("Can't connect");
        }//end catch
    }//end addData
    
}//end DatabaseConnector class
