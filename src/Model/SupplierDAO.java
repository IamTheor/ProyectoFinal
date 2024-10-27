package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SupplierDAO {
    private Conexion conexion;
    
    public SupplierDAO() {
        this.conexion = new Conexion();
    }
    
    public void createSupplier(Supplier supplier){
        String query = "INSERT INTO Suppliers (id_supplier, name_supplier, ruc_suplier) VALUES (?, ?, ?)";
        
        try (Connection conn = conexion.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)){

            pstmt.setInt(1, supplier.getSupplierId()); // Representa el primer ? en el query (int)
            pstmt.setString(2, supplier.getSupplier()); // Representa el segundo ? en el query (String)
            pstmt.setString(3, supplier.getRuc()); // Representa el tercer ? en el query (String)
            pstmt.executeUpdate();

            System.out.println("Tipo de Producto insertado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al insertar el tipo de producto: " + e.getMessage());
        }       
    }    
}
