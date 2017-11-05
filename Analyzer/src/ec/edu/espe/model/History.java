package ec.edu.espe.model;


public class History {
    
    private int currentPurchaseSale;
    private int seedMoney;
    private int simulationDay;
    private int purchaseSaleCount;
    private PurchaseSale[] purchaseSale;

    public History(int currentPurchaseSale, int seedMoney, int simulationDay, int purchaseSaleCount, PurchaseSale[] purchaseSale) {
        this.currentPurchaseSale = currentPurchaseSale;
        this.seedMoney = seedMoney;
        this.simulationDay = simulationDay;
        this.purchaseSaleCount = purchaseSaleCount;
        this.purchaseSale = purchaseSale;
    }

    public History() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getCurrentPurchaseSale() {
        return currentPurchaseSale;
    }

    /**
     * @param currentPurchaseSale the currentPurchaseSale to set
     */
    public void setCurrentPurchaseSale(int currentPurchaseSale) {
        this.currentPurchaseSale = currentPurchaseSale;
    }

    /**
     * @return the seedMoney
     */
    public int getSeedMoney() {
        return seedMoney;
    }

    /**
     * @param seedMoney the seedMoney to set
     */
    public void setSeedMoney(int seedMoney) {
        this.seedMoney = seedMoney;
    }

    /**
     * @return the simulationDay
     */
    public int getSimulationDay() {
        return simulationDay;
    }

    /**
     * @param simulationDay the simulationDay to set
     */
    public void setSimulationDay(int simulationDay) {
        this.simulationDay = simulationDay;
    }

    /**
     * @return the purchaseSaleCount
     */
    public int getPurchaseSaleCount() {
        return purchaseSaleCount;
    }

    /**
     * @param purchaseSaleCount the purchaseSaleCount to set
     */
    public void setPurchaseSaleCount(int purchaseSaleCount) {
        this.purchaseSaleCount = purchaseSaleCount;
    }

    /**
     * @return the purchaseSale
     */
    public PurchaseSale[] getPurchaseSale() {
        return purchaseSale;
    }

    /**
     * @param purchaseSale the purchaseSale to set
     */
    public void setPurchaseSale(PurchaseSale[] purchaseSale) {
        this.purchaseSale = purchaseSale;
    }

}