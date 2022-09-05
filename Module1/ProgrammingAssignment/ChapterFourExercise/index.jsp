
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payroll Entry</title>
    </head>
    <body>
        
        <form action="statement.jsp">
             
            <!-- Prints all information --->
            <p>Employee's Name: <input type="string" name="employeeName"> 
            <p>Number of Hours Worked: <input type="double" name="employeeHours"> 
            <p>Hourly Pay Rate: <input type="double" name="employeePayRate"> 
            <p>Federal Tax Withholding Rate (Decimal): <input type="double" name="taxFederal"> 
            <p>State Tax Withholding Rate (Decimal): <input type="double" name="taxState">    
            <input type="submit" name="submit" value="Submit"></p>
            
            
        </form>
        
    </body>
</html>
