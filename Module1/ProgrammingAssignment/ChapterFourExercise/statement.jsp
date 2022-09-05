
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payroll Statement</title>
    </head>
    <body>
        
        <!-- Gets all information -->
        <% String employeeName = request.getParameter("employeeName");
        double employeeHours = Double.parseDouble(request.getParameter("employeeHours"));
        double employeePayRate = Double.parseDouble(request.getParameter("employeePayRate"));
        double taxFederal = Double.parseDouble(request.getParameter("taxFederal"));
        double taxState = Double.parseDouble(request.getParameter("taxState"));
        // Calculates total pay and deductions
        double payGross = employeeHours * employeePayRate;
        double deductionFederal = payGross * taxFederal;
        double deductionState = payGross * taxState;
        double deductionTotal = deductionFederal + deductionState;
        double payNet = payGross - deductionTotal;
        // Changes doubles to have the format of 2 decimal places
        DecimalFormat df = new DecimalFormat("#.00");%>
        
        <!-- Prints all information -->
        <p>Employee Name: <%= employeeName %></p>
        <p>Hours Worked: <%= employeeHours %></p>
        <p>Pay Rate: $<%= df.format(employeePayRate) %></p>
        <p>Gross Pay: $<%= df.format(payGross) %></p>
        
        <p>Deductions: </p>
        <p style="text-indent: 25px;">Federal Withholding (<%= (int)(taxFederal * 100) %>%): $<%= df.format(deductionFederal) %></p>
        <p style="text-indent: 25px;">State Withholding (<%= (int)(taxState * 100) %>%): $<%= df.format(deductionState) %></p>
        <p style="text-indent: 25px;">Total Deduction: $<%= df.format(deductionTotal) %></p>
        
        <p>Net Pay: $<%= df.format(payNet) %></p>
        
        
    </body>
</html>
