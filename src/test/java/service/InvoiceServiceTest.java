package service;

import domain.Invoice;
import domain.Order;
import domain.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceServiceTest {
    @Test
    public void ShouldGenerateInvoiceWhenProductAndOrderExist() {
        var product = new Product();
        Order order = new Order();
        var invoice = new Invoice();
        var invoiceService = new InvoiceService();
        order.setProductBought("Wir");
        order.setBuyer("Petrus Gnębiciel");
        order.setBuyDate(LocalDate.of(2022, 10, 27));
        order.setHowMuchBought(69);
        product.setPrice(new BigDecimal(15));

        invoice = invoiceService.generateInvoice(product, order);

        assertEquals("Wir", invoice.getProductBought());
        assertEquals("Petrus Gnębiciel", invoice.getBuyer());
        assertEquals(LocalDate.of(2022, 10, 27), invoice.getBuyDate());
        assertEquals(69, invoice.getHowMuchBought());
        assertEquals(new BigDecimal(1035), invoice.getPriceForAll());
        assertEquals(new BigDecimal("1273.05"), invoice.getPricePlusTax());


    }

}