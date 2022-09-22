import java.math.BigDecimal;

public class Product {
    private BigDecimal hammerPrice = new BigDecimal("15");
    private BigDecimal breadPrice = new BigDecimal("2.30");
    private BigDecimal orangeJuicePrice = new BigDecimal("4");


    private String productName;
    private int quantity;

    private BigDecimal price;

    //Produkty są magiczne i wszystkie tego samego typu tracą ważność tego samego dnia jak coś. KappaPride
    private String expirationDate;


    public Product(String productName, BigDecimal price, int quantity, String expirationDate) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }


    public BigDecimal getHammerPrice() {
        return hammerPrice;
    }

    public BigDecimal getBreadPrice() {
        return breadPrice;
    }

    public BigDecimal getOrangeJuicePrice() {
        return orangeJuicePrice;
    }


    public String getExpirationDate() {
        return expirationDate;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
