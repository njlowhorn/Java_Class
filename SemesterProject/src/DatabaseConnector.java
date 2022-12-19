
package semesterproject;

import java.sql.*;
import java.util.LinkedList;

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
     * Method that adds data to a table
     * @param table String - The name of the table
     * @param fields String[] - The columns of the table
     * @param values Object[] - The rows of the table
     */
    public void addData(String table, String[] fields, Object[] values){
        String insertQuery = "INSERT INTO "; 
        insertQuery += table + "(";
        for(int i = 0; i < fields.length; i++){
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
        
        String status = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertQuery);
            statement.close();
            connection.close();
            status = "Success";
        }//end try
        catch(Exception e){
            status = "Can't connect";
        }//end catch
        //return status;
    }//end addData
    
    /**
     * Method that checks if a row is in a table
     * @param table String - The name of the table
     * @param fields String[] - The columns of the table
     * @param values Object[] - The rows of the table
     * @return boolean - false means that the data wasn't there; true means the data was
     */
    public boolean checkData(String table, String[] fields, Object[] values){
        String checkQuery = "SELECT * FROM ";
        checkQuery += table + " WHERE ";
        for(int i = 0; i < fields.length; i++){
            checkQuery += fields[i] + " = ";
            try{
                int temp = (int)values[i];
                checkQuery += values[i];
            }//end try
            catch(Exception e){
                checkQuery += "\"" + values[i] + "\"";
            }//end catch
            if(i < fields.length -1){
                checkQuery += " AND ";
            }//end if
            else{
                checkQuery += ";";
            }//end else
        }//end for
        
        boolean rowChecked = false;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(checkQuery);
            
            if(rs.next()){
                rowChecked = true;
            }//end if
            
            statement.close();
            connection.close();
        }//end try
        catch(Exception e){
        }//end catch
        return rowChecked;
    }//end checkData
    
    /**
     * Method that deletes rows from a table
     * @param table String - The name of the table
     * @param fields String[] - The columns of the table
     * @param values Object[] - The rows of the table 
     */
    public void deleteData(String table, String[] fields, Object[] values){
        String deleteQuery = "DELETE FROM "; 
        deleteQuery += table + " WHERE ";
        for(int i = 0; i < fields.length; i++){
            deleteQuery += fields[i] + " = ";
            try{
                int temp = (int)values[i];
                deleteQuery += values[i];
            }//end try
            catch(Exception e){
                deleteQuery += "\"" + values[i] + "\"";
            }//end catch
            if(i < fields.length -1){
                deleteQuery += " AND ";
            }//end if
            else{
                deleteQuery += ";";
            }//end else
        }//end for
        
        String status = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(deleteQuery);
            statement.close();
            connection.close();
            status = "Success";
        }//end try
        catch(Exception e){
            status = "Can't connect";
        }//end catch
        //return status;
    }//end deleteData
    
    /**
     * Method that returns the data in a row from a table
     * @param table String - The name of the table
     * @param fields String[] - The columns of the table
     * @param values Object[] - The rows of the table 
     * @param returnFields String[] - The columns whose values are returned
     * @return Object[] - The data from the row
     */
    public Object[] selectData(String table, String[] fields, Object[] values, String[] returnFields){
        String selectQuery = "SELECT * FROM ";
        selectQuery += table + " WHERE ";
        for(int i = 0; i < fields.length; i++){
            selectQuery += fields[i] + " = ";
            try{
                int temp = (int)values[i];
                selectQuery += values[i];
            }//end try//end try
            catch(Exception e){
                selectQuery += "\"" + values[i] + "\"";
            }//end catch//end catch
            if(i < fields.length -1){
                selectQuery += " AND ";
            }//end if
            else{
                selectQuery += ";";
            }//end else
        }//end for
        
        Object[] returnValues = new Object[returnFields.length];
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectQuery);
            
            while(rs.next()){
                for(int i = 0; i < returnValues.length; i++) {
                    returnValues[i] = rs.getObject(returnFields[i]);
                }//end for
            }//end while           
            
            statement.close();
            connection.close();
        }//end try//end try
        catch(Exception e){
        }//end catch
        return returnValues;
    }//end selectData
    
    /**
     * Method that returns the data in a column from a table
     * @param table String - The name of the table
     * @param fields String[] - The columns of the table
     * @param values Object[] - The rows of the table 
     * @param returnField String - The column whose data is returned
     * @return LinkedList&lt;Object&gt; - The data from the column
     */
    public LinkedList<Object> selectColumnData(String table, String[] fields, Object[] values, String returnField){
        String selectQuery = "SELECT * FROM ";
        selectQuery += table + " WHERE ";
        for(int i = 0; i < fields.length; i++){
            selectQuery += fields[i] + " = ";
            try{
                int temp = (int)values[i];
                selectQuery += values[i];
            }//end try//end try
            catch(Exception e){
                selectQuery += "\"" + values[i] + "\"";
            }//end catch//end catch
            if(i < fields.length -1){
                selectQuery += " AND ";
            }//end if
            else{
                selectQuery += ";";
            }//end else
        }//end for
        
        LinkedList<Object> returnValues = new LinkedList<>();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectQuery);

            while(rs.next()){
                returnValues.add(rs.getObject(returnField));
            }//end while
            
            statement.close();
            connection.close();
        }//end try//end try
        catch(Exception e){
        }//end catch
        return returnValues;
    }//end selectColumnData
}//end DatabaseConnector class
