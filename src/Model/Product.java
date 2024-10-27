package Model;

public class Product {
    private int productId;
    private int productTypeId;
    private String productName;
    private double productPrice;
    private int stock;
    private int supplierId;

    // Constructor
    public Product(int productId, int productTypeId, String productName, double productPrice, int stock, int supplierId) {
        this.productId = productId;
        this.productTypeId = productTypeId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.stock = stock;
        this.supplierId = supplierId;
    }

    // Getters y Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
}
