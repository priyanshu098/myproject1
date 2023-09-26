package servletlogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        
        String productId = request.getParameter("productId");

        
        String jdbcUrl = "jdbc:mysql://localhost:3306/ecommerce";
        String jdbcUsername = "your_username";
        String jdbcPassword = "your_password";

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);

           
            String sql = "SELECT * FROM products WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, productId);

            
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                
                String productName = resultSet.getString("name");
                String productDescription = resultSet.getString("description");
                double productPrice = resultSet.getDouble("price");
                
                out.println("<h2>Product Details</h2>");
                out.println("<p>ID: " + productId + "</p>");
                out.println("<p>Name: " + productName + "</p>");
                out.println("<p>Description: " + productDescription + "</p>");
                out.println("<p>Price: $" + productPrice + "</p>");
            } else {
                
                out.println("<p>Product not found.</p>");
            }

            // Close resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("<p>Database error: " + e.getMessage() + "</p>");
        }
    }
}
