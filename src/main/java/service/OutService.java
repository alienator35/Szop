package service;
import domain.*;

public class OutService {

    public ProductOut removeItem(Product product, Invoice invoice){
        ProductOut productOut = new ProductOut();
        productOut.setProductOutOfShop(product.getProductName());
        productOut.setQuantityOutOfShop(invoice.getHowMuchBought());
        return productOut;


    }
}
