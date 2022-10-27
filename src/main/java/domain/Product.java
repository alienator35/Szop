package domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private long id;


    private String productName;
    private int quantity;

    private BigDecimal price;

    //Produkty są magiczne i wszystkie tego samego typu tracą ważność tego samego dnia jak coś. KappaPride
    private LocalDate expirationDate;

    public void setId(long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
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
