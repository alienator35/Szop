package domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {
    private String buyer;
    private LocalDate buyDate;
    private BigDecimal priceForAll;
    private String productBought;
    private BigDecimal pricePlusTax;
    private int howMuchBought;

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

    public String getBuyer() {
        return buyer;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public BigDecimal getPriceForAll() {
        return priceForAll;
    }

    public String getProductBought() {
        return productBought;
    }

    public BigDecimal getPricePlusTax() {
        return pricePlusTax;
    }

    public void setPriceForAll(BigDecimal priceForAll) {
        this.priceForAll = priceForAll;
    }

    public void setProductBought(String productBought) {
        this.productBought = productBought;
    }

    public void setPricePlusTax(BigDecimal pricePlusTax) {
        this.pricePlusTax = pricePlusTax;
    }

    public void setHowMuchBought(int howMuchBought) {
        this.howMuchBought = howMuchBought;
    }

    public int getHowMuchBought() {
        return howMuchBought;
    }


}
