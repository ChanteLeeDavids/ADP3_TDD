package za.ac.cput;

public class Product {
    private String prodID;
    private String prodName;

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodID='" + prodID + '\'' +
                ", prodName='" + prodName + '\'' +
                '}';
    }
}
