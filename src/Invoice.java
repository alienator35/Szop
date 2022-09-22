import java.math.BigDecimal;

public class Invoice {
    private String buyer;
    private String buyDate;
    private BigDecimal priceForAll;
    private String productBought;
    private BigDecimal pricePlusTax;

    public int getHowMuchBought() {
        return howMuchBought;
    }

    private int howMuchBought;

    public Invoice(String buyer, int howMuchBought, String buyDate,String productBought, BigDecimal priceForAll, BigDecimal pricePlusTax){
        this.buyer = buyer;
        this.howMuchBought = howMuchBought;
        this.buyDate = buyDate;
        this.productBought = productBought;
        this.priceForAll = priceForAll;
        this.pricePlusTax = pricePlusTax;

    }

}
