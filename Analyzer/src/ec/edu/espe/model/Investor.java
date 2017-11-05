
package ec.edu.espe.model;


class Investor {
    private int saleTime;
    private String broker;
    private int quantityShare;
    private double payFee;
    private int purchaseTime;

    public Investor(int saleTime, String broker, int quantityShare, double payFee, int purchaseTime) {
        this.saleTime = saleTime;
        this.broker = broker;
        this.quantityShare = quantityShare;
        this.payFee = payFee;
        this.purchaseTime = purchaseTime;
    }

    /**
     * @return the saleTime
     */
    public int getSaleTime() {
        return saleTime;
    }

    /**
     * @param saleTime the saleTime to set
     */
    public void setSaleTime(int saleTime) {
        this.saleTime = saleTime;
    }

    /**
     * @return the broker
     */
    public String getBroker() {
        return broker;
    }

    /**
     * @param broker the broker to set
     */
    public void setBroker(String broker) {
        this.broker = broker;
    }

    /**
     * @return the quantityShare
     */
    public int getQuantityShare() {
        return quantityShare;
    }

    /**
     * @param quantityShare the quantityShare to set
     */
    public void setQuantityShare(int quantityShare) {
        this.quantityShare = quantityShare;
    }

    /**
     * @return the payFee
     */
    public double getPayFee() {
        return payFee;
    }

    /**
     * @param payFee the payFee to set
     */
    public void setPayFee(double payFee) {
        this.payFee = payFee;
    }

    /**
     * @return the purchaseTime
     */
    public int getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * @param purchaseTime the purchaseTime to set
     */
    public void setPurchaseTime(int purchaseTime) {
        this.purchaseTime = purchaseTime;
    }
    
    
}
