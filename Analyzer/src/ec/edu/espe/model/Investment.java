
package ec.edu.espe.model;

class Investment {
    private float quantity;
    private double purchaseTransferenceFee;
    private double saleTransferenceFee;
    private float purchasePrice;
    private Investor[] investor;

    public Investment(float quantity, double purchaseTransferenceFee, double saleTransferenceFee, float purchasePrice, Investor[] investor) {
        this.quantity = quantity;
        this.purchaseTransferenceFee = purchaseTransferenceFee;
        this.saleTransferenceFee = saleTransferenceFee;
        this.purchasePrice = purchasePrice;
        this.investor = investor;
    }

    /**
     * @return the quantity
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the purchaseTransferenceFee
     */
    public double getPurchaseTransferenceFee() {
        return purchaseTransferenceFee;
    }

    /**
     * @param purchaseTransferenceFee the purchaseTransferenceFee to set
     */
    public void setPurchaseTransferenceFee(double purchaseTransferenceFee) {
        this.purchaseTransferenceFee = purchaseTransferenceFee;
    }

    /**
     * @return the saleTransferenceFee
     */
    public double getSaleTransferenceFee() {
        return saleTransferenceFee;
    }

    /**
     * @param saleTransferenceFee the saleTransferenceFee to set
     */
    public void setSaleTransferenceFee(double saleTransferenceFee) {
        this.saleTransferenceFee = saleTransferenceFee;
    }

    /**
     * @return the purchasePrice
     */
    public float getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * @param purchasePrice the purchasePrice to set
     */
    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * @return the investor
     */
    public Investor[] getInvestor() {
        return investor;
    }

    /**
     * @param investor the investor to set
     */
    public void setInvestor(Investor[] investor) {
        this.investor = investor;
    }
    
    
}
