import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class Shop {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Product product1 = productService.addProduct();


        System.out.println(product1.getProductName() + " " + product1.getQuantity());

        InvoiceService invoiceService = new InvoiceService();
        Invoice invoice1 = invoiceService.generateInvoice(product1, "Krzyś Chmura");
        System.out.println(invoice1.getBuyer() + " kupił " + invoice1.getProductBought() + ". Ilość: " + invoice1.getHowMuchBought() + ". Netto: " + invoice1.getPriceForAll() + ". Brutto: " + invoice1.getPricePlusTax());

        OutService outService = new OutService();
        ProductOut out1 = outService.removeItem(product1, invoice1);
        product1.setQuantity(product1.getQuantity() - out1.getQuantityOutOfShop());
        System.out.println(product1.getProductName() + " " + product1.getQuantity());

        InService inService = new InService();
        ProductIn in1 = inService.addItem(20, "Hammer");
        product1.setQuantity(product1.getQuantity() + in1.getQuanityIntoShop());
        System.out.println(product1.getProductName() + " " + product1.getQuantity());


//
//        ProductOut[] lostProducts = new ProductOut[2];
//
//        lostProducts[0] = new ProductOut();
//        lostProducts[0].setProductOutOfShop("Hammer");
//        lostProducts[0].setQuantityOutOfShop(10);
//
//        lostProducts[1] = new ProductOut();
//        lostProducts[1].setProductOutOfShop("Orange Juice");
//        lostProducts[1].setQuantityOutOfShop(33);
//
//
//             for (Product i : on) {
//             System.out.println(i.getProductName() + " costs " + i.getPrice() + " $. We have " + i.getQuantity() + " " + i.getProductName() + "s, expiration date is " + i.getExpirationDate());
//          }


    }

}
