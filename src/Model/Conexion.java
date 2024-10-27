package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Clase para la conexión con la base de datos
// Instanciar:
// private Conexion Conexion
// conexion.getConnection()

public class Conexion {
    private Connection SQLConexion;
    
    public Conexion() {
        // Ruta de la base de datos
        String host = "localhost";
        String port = "3306";
        String nameDB = "ProyectoFinal";
        
        // Acceder a la url mediante XAMPP
        String user = "root";
        String password = "";
        
        // Driver JDBC
        String driver = "com.mysql.cj.jdbc.Driver";
        
        String dataBaseURL = "jdbc:mysql://" + host + ":" + port + "/" + nameDB + "?useSSL=false";
        
        // Uso del try-catch para la conexión a la base de datos
        try {
            // Cargar el driver JDBC
            Class.forName(driver);
            
            // Establecer la conexión
            SQLConexion = DriverManager.getConnection(dataBaseURL, user, password);
            
            if (SQLConexion != null) {
                System.out.println("Conexión creada correctamente");
            }
            
        } catch (ClassNotFoundException e) {
            // Error si el driver no está disponible
            System.out.println("Error: No se pudo cargar el driver de MySQL");
            e.printStackTrace();
        } catch (SQLException e) {
            // Error al conectarse a la base de datos
            System.out.println("Error al conectarse a la base de datos");
            e.printStackTrace();
        }
    }
    
    public Connection getConnection() {
        return SQLConexion;
    }
    
    // Método para cerrar la conexión cuando sea necesario
    public void cerrarConexion() {
        try {
            if (SQLConexion != null && !SQLConexion.isClosed()) {
                SQLConexion.close();
                System.out.println("Conexión cerrada correctamente");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión");
            e.printStackTrace();
        }
    }
}