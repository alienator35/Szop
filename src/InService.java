public class InService {

    public ProductIn addItem(int howManyToAdd, String productName) {
        ProductIn productIn = new ProductIn();
        productIn.setProductIntoShop(productName);
        productIn.setQuanityIntoShop(howManyToAdd);
        return productIn;
    }
}

