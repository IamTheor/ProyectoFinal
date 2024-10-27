package Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ProductDAO {
    private Conexion conexion;

    public ProductDAO(){
        this.conexion = new Conexion();
    }
    
    public void createProduct(Product product){
        String query = "INSERT INTO Products (id_product, id_productType, name_product, price_product, stock, id_supplier) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = conexion.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)){

            pstmt.setInt(1, product.getProductId()); // Representa el primer ? en el query (int)
            pstmt.setInt(2, product.getProductTypeId()); // Representa el segundo ? en el query (int)
            pstmt.setString(3, product.getProductName()); // Representa el tercer ? en el query (String)
            pstmt.setDouble(4, product.getProductPrice()); // Representa el cuarto ? en el query (double)
            pstmt.setInt(5, product.getStock()); // Representa el quinto ? en el query (int)
            pstmt.setInt(6, product.getSupplierId()); // Representa el sexto ? en el query (int)
            pstmt.executeUpdate();

            System.out.println("Producto insertado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al insertar producto: " + e.getMessage());
        }       
    }    
    
}
