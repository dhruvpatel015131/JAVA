<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>

<%
    // Establish database connection
    Context initContext = new InitialContext();
    Context envContext = (Context) initContext.lookup("java:/comp/env");
    DataSource dataSource = (DataSource) envContext.lookup("jdbc/yourDataSource");

    Connection connection = dataSource.getConnection();

    // Prepare and execute the stored procedure
    CallableStatement statement = connection.prepareCall("{call yourStoredProcedure(?, ?)}");
    statement.setString(1, "yourParameter1");
    statement.setString(2, "yourParameter2");

    ResultSet resultSet = statement.executeQuery();

    // Process the result set
    while (resultSet.next()) {
        // Retrieve the required information from the result set
        int poId = resultSet.getInt("poId");
        String supplierNm = resultSet.getString("supplierNm");
        Date podt = resultSet.getDate("podt");
        double poAmt = resultSet.getDouble("poAmt");

        int srNo = resultSet.getInt("srNo");
        String prodCode = resultSet.getString("prodCode");
        int quantity = resultSet.getInt("quantity");
        double rate = resultSet.getDouble("rate");

        // Do something with the retrieved data
        // ...
    }

    // Close the database connection and resources
    resultSet.close();
    statement.close();
    connection.close();
%>
	
</body>
</html>