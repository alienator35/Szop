import java.time.LocalDate;

public class Order {
    private String buyer;
    private String productBought;
    private int howMuchBought;
    private LocalDate buyDate;


    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getProductBought() {
        return productBought;
    }

    public void setProductBought(String productBought) {
        this.productBought = productBought;
    }

    public int getHowMuchBought() {
        return howMuchBought;
    }

    public void setHowMuchBought(int howMuchBought) {
        this.howMuchBought = howMuchBought;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

}
