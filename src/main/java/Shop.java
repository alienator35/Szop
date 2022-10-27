import domain.*;
import service.*;

import java.io.FileNotFoundException;

public class Shop {
    public static void main(String[] args) throws FileNotFoundException {

//        List<String> among =  new ArrayList<>(5);
//        among.add("Jezus");
//        among.add("Chrystus");
//        among.add("Superstar");
//        System.out.println(among.get(2));

        ProductService productService = new ProductService();
        Product hammer = productService.addProduct("Hammer");
        Product orangeJuice = productService.addProduct("Orange_Juice");

        OrderService orderService = new OrderService();
        Order order1 = orderService.generateOrder("Shop Order.txt");
        Order order2 = orderService.generateOrder("Shop Order 2.txt");

        System.out.println(hammer.getProductName() + " " + hammer.getQuantity());

        InvoiceService invoiceService = new InvoiceService();
        Invoice invoice1 = invoiceService.generateInvoice(hammer, order1);
        System.out.println(invoice1.getBuyer() + " kupił " + invoice1.getProductBought() + ". Ilość: " + invoice1.getHowMuchBought() + ". Netto: " + invoice1.getPriceForAll() + ". Brutto: " + invoice1.getPricePlusTax() + " " + invoice1.getBuyDate());

        OutService outService = new OutService();
        ProductOut out1 = outService.removeItem(hammer, invoice1);
        hammer.setQuantity(hammer.getQuantity() - out1.getQuantityOutOfShop());
        System.out.println(hammer.getProductName() + " " + hammer.getQuantity());

        InService inService = new InService();
        ProductIn in1 = inService.addItem(20, "Hammer");
        hammer.setQuantity(hammer.getQuantity() + in1.getQuanityIntoShop());
        System.out.println(hammer.getProductName() + " " + hammer.getQuantity());

        System.out.println(orangeJuice.getProductName() + " " + orangeJuice.getPrice() + " Ilość: " + orangeJuice.getQuantity());
        Invoice invoice2 = invoiceService.generateInvoice(orangeJuice, order2);
        System.out.println(invoice2.getBuyer() + " kupił " + invoice2.getProductBought() + ". Ilość: " + invoice2.getHowMuchBought() + ". Netto: " + invoice2.getPriceForAll() + ". Brutto: " + invoice2.getPricePlusTax() + " " + invoice2.getBuyDate());
        ProductOut out2 = outService.removeItem(orangeJuice, invoice2);
        orangeJuice.setQuantity(orangeJuice.getQuantity() - out2.getQuantityOutOfShop());
        System.out.println(orangeJuice.getProductName() + " " + orangeJuice.getQuantity());

    }

}
