package Model;

public class Supplier {
    private int supplierId;
    private String supplier;
    private String ruc;
    
    // Constructor
    public Supplier(int supplierId, String supplier, String ruc) {
        this.supplierId = supplierId;
        this.supplier = supplier;
        this.ruc = ruc;
    }
    
    // Getters y Setters
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
}
