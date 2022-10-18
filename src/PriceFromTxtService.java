import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class PriceFromTxtService {
    public PriceFromTxt[] fetchPriceFromTxt() throws FileNotFoundException {
        Scanner scanTxt = new Scanner(new File("E:\\Products Price.txt"));
        String txtHammerPrice = scanTxt.nextLine();
        String txtOrangeJuicePrice = scanTxt.nextLine();
        String txtAmogusBodyPillowPrice = scanTxt.nextLine();

        String[] splittedHammerPrice = txtHammerPrice.split(": ");
        BigDecimal hammerPrice = new BigDecimal(splittedHammerPrice[1]);
        PriceFromTxt hammerPriceObject = new PriceFromTxt();
        hammerPriceObject.setProductName(splittedHammerPrice[0]);
        hammerPriceObject.setProductPrice(hammerPrice);

        String[] splittedOrangeJuicePrice = txtOrangeJuicePrice.split(": ");
        BigDecimal orangeJuicePrice = new BigDecimal(splittedOrangeJuicePrice[1]);
        PriceFromTxt orangeJuicePriceObject = new PriceFromTxt();
        orangeJuicePriceObject.setProductName(splittedOrangeJuicePrice[0]);
        orangeJuicePriceObject.setProductPrice(orangeJuicePrice);

        String[] splittedAmogusBodyPillowPrice = txtAmogusBodyPillowPrice.split(": ");
        BigDecimal amogusBodyPillowPrice = new BigDecimal(splittedAmogusBodyPillowPrice[1]);
        PriceFromTxt amogusBodyPillowPriceObject = new PriceFromTxt();
        amogusBodyPillowPriceObject.setProductName(splittedAmogusBodyPillowPrice[0]);
        amogusBodyPillowPriceObject.setProductPrice(amogusBodyPillowPrice);

        PriceFromTxt[] objectPrices;
        objectPrices = new PriceFromTxt[3];

        objectPrices[0] = hammerPriceObject;
        objectPrices[1] = orangeJuicePriceObject;
        objectPrices[2] = amogusBodyPillowPriceObject;

        return objectPrices;


    }


}


