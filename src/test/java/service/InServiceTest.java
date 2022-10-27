package service;

import domain.ProductIn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InServiceTest {
    @Test
    public void ShouldAddItemWhenAddingItem() { /// xDDD
        var inService = new InService();
        var productIn = new ProductIn();

        productIn = inService.addItem(69, "Wir");

        assertEquals(69, productIn.getQuanityIntoShop());
        assertEquals("Wir", productIn.getProductIntoShop());

    }

}