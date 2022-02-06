package za.ac.cput;

public class Product {
    private String prodID;
    private String prodAmount;

    public String getProdAmount() {
        return prodAmount;
    }

    public void setProdName(String prodName) {
        this.prodAmount = prodAmount;
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
                ", prodName='" + prodAmount + '\'' +
                '}';
    }
}
