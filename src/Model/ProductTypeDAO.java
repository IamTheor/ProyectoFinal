package Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ProductTypeDAO {
    private Conexion conexion;
    
    public ProductTypeDAO() {
        this.conexion = new Conexion();
    }
    
    public void createProductType(ProductType productType){
        String query = "INSERT INTO ProductTypes (id_productType, name_productType) VALUES (?, ?)";
        
        try (Connection conn = conexion.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)){

            pstmt.setInt(1, productType.getIdProductType()); // Representa el primer ? en el query (int)
            pstmt.setString(2, productType.getProductType()); // Representa el segundo ? en el query (String)
            pstmt.executeUpdate();

            System.out.println("Tipo de Producto insertado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al insertar el tipo de producto: " + e.getMessage());
        }       
    }
}
