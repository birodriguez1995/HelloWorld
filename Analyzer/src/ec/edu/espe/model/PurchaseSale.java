
package ec.edu.espe.model;

public class PurchaseSale {
    private String symbol;
    private int quantity;
    private int purchaseDateTime;
    private int purchasePrice;
    private Investment[] investment;

    public PurchaseSale(String symbol, int quantity, int purchaseDateTime, int purchasePrice, Investment[] investment) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.purchaseDateTime = purchaseDateTime;
        this.purchasePrice = purchasePrice;
        this.investment = investment;
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the purchaseDateTime
     */
    public int getPurchaseDateTime() {
        return purchaseDateTime;
    }

    /**
     * @param purchaseDateTime the purchaseDateTime to set
     */
    public void setPurchaseDateTime(int purchaseDateTime) {
        this.purchaseDateTime = purchaseDateTime;
    }

    /**
     * @return the purchasePrice
     */
    public int getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * @param purchasePrice the purchasePrice to set
     */
    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * @return the investment
     */
    public Investment[] getInvestment() {
        return investment;
    }

    /**
     * @param investment the investment to set
     */
    public void setInvestment(Investment[] investment) {
        this.investment = investment;
    }
    
}
