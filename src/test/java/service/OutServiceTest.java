package service;

import domain.Invoice;
import domain.Product;
import domain.ProductOut;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutServiceTest {
    @Test
    public void ShoudRemoveItemWhenInvoiceAndProductExist() {
        var productOut = new ProductOut();
        var outService = new OutService();
        var invoice = new Invoice();
        var product = new Product();

        invoice.setHowMuchBought(10);
        product.setProductName("Orange Juice");
        productOut = outService.removeItem(product, invoice);


        assertEquals("Orange Juice",productOut.getProductOutOfShop());
        assertEquals(10,productOut.getQuantityOutOfShop());


    }


}