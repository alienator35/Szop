import java.math.BigDecimal;

public class ProductService {
    public Product addProduct() {

        Product product = new Product();
        product.setProductName("Hammer");
        product.setQuantity(42);
        product.setPrice(new BigDecimal("15"));
        product.setId(1);
        return product;
    }


}

