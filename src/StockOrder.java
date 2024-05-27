public class StockOrder {
     int quantity;
     float certainer;
     String commission;
     Stock stock;


    public StockOrder(int quantity, float certainer, String commission, Investments inves, Stock stock) {
        this.quantity = quantity;
        this.certainer = certainer;
        this.commission = commission;
        this.stock = stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getCertainer() {
        return certainer;
    }

    public void setCertainer(float certainer) {
        this.certainer = certainer;
    }

    public String getCommission() {
        return commission;
    }
    public void setCommission(String commission) {
        this.commission = commission;
    }

}
