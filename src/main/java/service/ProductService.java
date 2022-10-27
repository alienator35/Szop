package service;
import domain.*;

import java.io.FileNotFoundException;

public class ProductService {
    public Product addProduct(String productName) throws FileNotFoundException {
        PriceFromTxtService priceFromTxtService = new PriceFromTxtService();

        PriceFromTxt productPrice = priceFromTxtService.fetchPriceFromTxt(productName);

        Product product = new Product();
        product.setProductName(productName);
        product.setQuantity(42);
        product.setPrice(productPrice.getProductPrice());
        product.setId(1);
        return product;
    }
}

