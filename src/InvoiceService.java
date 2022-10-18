import java.math.BigDecimal;
import java.time.LocalDate;

public class InvoiceService {

    public Invoice generateInvoice(Product product,Order order) {
        Invoice invoice = new Invoice();
        invoice.setProductBought(order.getProductBought());
        invoice.setBuyer(order.getBuyer());
        invoice.setBuyDate(order.getBuyDate());
        invoice.setHowMuchBought(order.getHowMuchBought());
        invoice.setPriceForAll(product.getPrice().multiply(new BigDecimal(invoice.getHowMuchBought())));
        invoice.setPricePlusTax(invoice.getPriceForAll().multiply(new BigDecimal("0.23")).add(invoice.getPriceForAll()));
        return invoice;


    }

}
