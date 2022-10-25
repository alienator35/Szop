import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PriceFromTxtService {
    public PriceFromTxt fetchPriceFromTxt(String productName) throws FileNotFoundException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("Products Price.txt");
        Scanner fileWithProductsPrice = new Scanner(is);

        List<PriceFromTxt> pricesFromTxt = new ArrayList<>();

        while (fileWithProductsPrice.hasNextLine()) {
            PriceFromTxt priceFromTxt = new PriceFromTxt();

            String[] productNameWithPrice = fileWithProductsPrice.nextLine().split(": "); // pobieram linijkę z pliku - i splituje to. Pierwszy element to nazwa, drugi to cena
            priceFromTxt.setProductName(productNameWithPrice[0]);
            priceFromTxt.setProductPrice(new BigDecimal(productNameWithPrice[1]));

            pricesFromTxt.add(priceFromTxt);
        }

        for (PriceFromTxt priceFromTxt : pricesFromTxt) {
            if (productName.equalsIgnoreCase(priceFromTxt.getProductName())) {
                return priceFromTxt;
            }
        }
        return null;
    }

}


