import java.math.BigDecimal;

public class Shop {
    public static void main(String[] args) {

        Product[] onShelves = new Product[3];

        onShelves[0] = new Product("Hammer", ), 104, "never");
        onShelves[1] = new Product("Bread", new BigDecimal("2.30"), 58, "26.09.2022");
        onShelves[2] = new Product("Orange Juice", new BigDecimal("4"), 30, "4.06.2023");

        Invoice[] newInvoice = new Invoice[2];
        BigDecimal tax = new BigDecimal("0.23");


        newInvoice[0] = new Invoice("Krzysztof Chmura", 8, "22.09.2022", "Hammer",;




        //     for (Product i : onShelves) {
        //     System.out.println(i.getProductName() + " costs " + i.getPrice() + " dolars. We have " + i.getQuantity() + " " + i.getProductName() + "s, expiration date is " + i.getExpirationDate());
        //


    }

}
}