import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) throws FileNotFoundException {


        ProductService productService = new ProductService();
        Product product1 = productService.addProduct();

        OrderService orderService = new OrderService();
        Order order1 = orderService.generateOrder("E:\\Shop Order.txt");


        System.out.println(product1.getProductName() + " " + product1.getQuantity());

        InvoiceService invoiceService = new InvoiceService();
        Invoice invoice1 = invoiceService.generateInvoice(product1, order1);
        System.out.println(invoice1.getBuyer() + " kupił " + invoice1.getProductBought() + ". Ilość: " + invoice1.getHowMuchBought() + ". Netto: " + invoice1.getPriceForAll() + ". Brutto: " + invoice1.getPricePlusTax() + " " + invoice1.getBuyDate());

        OutService outService = new OutService();
        ProductOut out1 = outService.removeItem(product1, invoice1);
        product1.setQuantity(product1.getQuantity() - out1.getQuantityOutOfShop());
        System.out.println(product1.getProductName() + " " + product1.getQuantity());

        InService inService = new InService();
        ProductIn in1 = inService.addItem(20, "Hammer");
        product1.setQuantity(product1.getQuantity() + in1.getQuanityIntoShop());
        System.out.println(product1.getProductName() + " " + product1.getQuantity());


    }

}
