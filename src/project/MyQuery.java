
package project;



import java.sql.*;
import java.util.ArrayList;

public class MyQuery {
  public Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","Ruqayyah");
        } catch (SQLException ex) {
            
        }
        return con;
    }  
    public ArrayList<Product> BindTable(){
        
   ArrayList<Product> list = new ArrayList<Product>();
   Connection con = getConnection();
   Statement st;
   ResultSet rs;
    try {
   st = con.createStatement();
   rs = st.executeQuery("SELECT * FROM products");
   
   Product p;
   while(rs.next()){
   p = new Product(
   rs.getString(1),
   rs.getString(2),
   rs.getString(3),
   rs.getString(4),
   rs.getBytes(5)
   );
   list.add(p);
   }
   
   }  
  catch (SQLException ex) {
    java.util.logging.Logger.getLogger(MyQuery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
   }  
   return list;
   }
}
