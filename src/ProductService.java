import java.io.FileNotFoundException;

public class ProductService {
    public Product addHammer() throws FileNotFoundException {

        PriceFromTxt[] objectPrices;
        objectPrices = new PriceFromTxt[3];
        PriceFromTxtService priceFromTxtService = new PriceFromTxtService();
        objectPrices = priceFromTxtService.fetchPriceFromTxt();
        PriceFromTxt hammerPriceObject = new PriceFromTxt();
        PriceFromTxt orangeJuicePriceObject = new PriceFromTxt();
        PriceFromTxt amogusBodyPillowPrice = new PriceFromTxt();

        hammerPriceObject = objectPrices[0];
        orangeJuicePriceObject = objectPrices[1];
        amogusBodyPillowPrice = objectPrices[2];

        Product product = new Product();
        product.setProductName("Hammer");
        product.setQuantity(42);
        product.setPrice(hammerPriceObject.getProductPrice());
        product.setId(1);
        return product;
    }

    public Product addOrangeJuice() throws FileNotFoundException {

        PriceFromTxt[] objectPrices;
        objectPrices = new PriceFromTxt[3];
        PriceFromTxtService priceFromTxtService = new PriceFromTxtService();
        objectPrices = priceFromTxtService.fetchPriceFromTxt();
        PriceFromTxt hammerPriceObject = new PriceFromTxt();
        PriceFromTxt orangeJuicePriceObject = new PriceFromTxt();
        PriceFromTxt amogusBodyPillowPrice = new PriceFromTxt();

        hammerPriceObject = objectPrices[0];
        orangeJuicePriceObject = objectPrices[1];
        amogusBodyPillowPrice = objectPrices[2];

        Product product = new Product();
        product.setProductName("Orange Juice");
        product.setQuantity(13);
        product.setPrice(orangeJuicePriceObject.getProductPrice());
        product.setId(2);
        return product;
    }

    public Product addAmogusBodyPillow() throws FileNotFoundException {

        PriceFromTxt[] objectPrices;
        objectPrices = new PriceFromTxt[3];
        PriceFromTxtService priceFromTxtService = new PriceFromTxtService();
        objectPrices = priceFromTxtService.fetchPriceFromTxt();
        PriceFromTxt hammerPriceObject = new PriceFromTxt();
        PriceFromTxt orangeJuicePriceObject = new PriceFromTxt();
        PriceFromTxt amogusBodyPillowPrice = new PriceFromTxt();

        hammerPriceObject = objectPrices[0];
        orangeJuicePriceObject = objectPrices[1];
        amogusBodyPillowPrice = objectPrices[2];

        Product product = new Product();
        product.setProductName("Amogus Body Pillow");
        product.setQuantity(69);
        product.setPrice(amogusBodyPillowPrice.getProductPrice());
        product.setId(3);
        return product;

    }
}
