package service;

import domain.Product;
import exception.ArgumentNotFoundException;
import exception.OrderNotFoundException;
import service.ProductService;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    @Test
    public void ShouldAddProductWhenAddingProduct() throws FileNotFoundException {
        var productService = new ProductService();
        Product product = new Product();

        product = productService.addProduct("Hammer");

        assertEquals("Hammer", product.getProductName());
        assertEquals(new BigDecimal(10), product.getPrice());
    }

    @Test
    public void ShouldArgumentNotFoundExceptionWhenBadArgument() throws ArgumentNotFoundException {
        var productService = new ProductService();
        Exception exception = assertThrows(ArgumentNotFoundException.class, () -> {
           productService.addProduct(null);
        });
    }



}