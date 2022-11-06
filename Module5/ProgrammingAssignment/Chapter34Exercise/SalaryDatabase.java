
package salarydatabase;

public class SalaryDatabase {

    private static String url = "jdbc:mysql://localhost:3306/SDEV200";
    private static String username = "root";
    private static String password = "";

    public static void main(String[] args) {
        DatabaseConnector db = new DatabaseConnector(url, username, password);
        
        String table = "Salary";
        String[] fieldsWithType = {"personID INTEGER AUTO_INCREMENT PRIMARY KEY", "firstName VARCHAR(100)", 
                                   "lastName VARCHAR(100)", "rank VARCHAR(15)", "salary FLOAT"};
        String[] fields = {"firstName", "lastName", "rank", "salary"};
        
        Object[] values1 = {"Nolan", "Lowhorn", "Package Handler", 20000};
        Object[] values2 = {"Bob", "Smith", "Manager", 50000};
        Object[] values3 = {"James", "Darrell", "Manager", 60000};
        Object[] values4 = {"Amy", "Evans", "CEO", 120000};
        
        db.createTable(table, fieldsWithType);
        
        db.addData(table, fields, values1);
        db.addData(table, fields, values2);
        db.addData(table, fields, values3);
        db.addData(table, fields, values4);
    }//end main
    
}//end SalaryDatabse class
