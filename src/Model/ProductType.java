package Model;

public class ProductType {
    private int productTypeId;
    private String productType;

    // Constructor
    public ProductType(int idProductType, String ProductType) {
        this.productTypeId = idProductType;
        this.productType = ProductType;
    }

    // Getters y Setters
    public int getIdProductType() {
        return productTypeId;
    }

    public void setIdProductType(int idProductType) {
        this.productTypeId = idProductType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String ProductType) {
        this.productType = ProductType;
    }
    
}
