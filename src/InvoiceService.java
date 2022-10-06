import java.math.BigDecimal;
import java.time.LocalDate;

public class InvoiceService {

    public Invoice generateInvoice(Product product, String buyer) {
        Invoice invoice = new Invoice();
        invoice.setProductBought(product.getProductName());
        invoice.setBuyer(buyer);
        invoice.setBuyDate(LocalDate.of(2022, 9, 22));
        invoice.setHowMuchBought(10);
        invoice.setPriceForAll(product.getPrice().multiply(new BigDecimal(invoice.getHowMuchBought())));
        invoice.setPricePlusTax(invoice.getPriceForAll().multiply(new BigDecimal("0.23")).add(invoice.getPriceForAll()));
        return invoice;


    }

}
