import java.math.BigDecimal;
import java.time.LocalDate;

public class Shop {
    public static void main(String[] args) {

        Product[] onShelves = new Product[3];

        onShelves[0] = new Product();
        onShelves[0].setProductName("Hammer");
        onShelves[0].setQuantity(42);
        onShelves[0].setPrice(new BigDecimal("15"));
        onShelves[0].setId(1);

        onShelves[1] = new Product();
        onShelves[1].setProductName("Bread");
        onShelves[1].setQuantity(32);
        onShelves[1].setPrice(new BigDecimal("2.30"));
        onShelves[1].setExpirationDate(LocalDate.of(2022, 9, 30));
        onShelves[1].setId(2);

        onShelves[2] = new Product();
        onShelves[2].setProductName("Orange Juice");
        onShelves[2].setQuantity(57);
        onShelves[2].setPrice(new BigDecimal("5.50"));
        onShelves[2].setExpirationDate(LocalDate.of(2023, 5, 26));
        onShelves[2].setId(3);


        Invoice[] newInvoice = new Invoice[2];

        newInvoice[0] = new Invoice();
        newInvoice[0].setProductBought("Hammer");
        newInvoice[0].setBuyer("Krzysztof Chmura");
        newInvoice[0].setBuyDate(LocalDate.of(2022, 9, 22));
        newInvoice[0].setHowMuchBought(10);
        newInvoice[0].setPriceForAll(new BigDecimal("150"));
        newInvoice[0].setPricePlusTax(new BigDecimal("185.5"));

        newInvoice[1] = new Invoice();
        newInvoice[1].setProductBought("Orange Juice");
        newInvoice[1].setBuyer("Alfred Moggus");
        newInvoice[1].setBuyDate(LocalDate.of(2022, 9, 21));
        newInvoice[1].setHowMuchBought(33);
        newInvoice[1].setPriceForAll(new BigDecimal("181.5"));
        newInvoice[1].setPricePlusTax(new BigDecimal("223.25"));


        ProductOut[] lostProducts = new ProductOut[2];

        lostProducts[0] = new ProductOut();
        lostProducts[0].setProductOutOfShop("Hammer");
        lostProducts[0].setQuantityOutOfShop(10);

        lostProducts[1] = new ProductOut();
        lostProducts[1].setProductOutOfShop("Orange Juice");
        lostProducts[1].setQuantityOutOfShop(33);


        //     for (Product i : onShelves) {
        //     System.out.println(i.getProductName() + " costs " + i.getPrice() + " $. We have " + i.getQuantity() + " " + i.getProductName() + "s, expiration date is " + i.getExpirationDate());
        //  }

        //  for (Invoice i : newInvoice) {
        //      System.out.println(i.getBuyer() + " bought " + i.getHowMuchBought() + " " + i.getProductBought() + " " + i.getBuyDate() + ". minus tax= " + i.getPriceForAll() + " plus tax= " + i.getPricePlusTax());
        //  }


    }

}
