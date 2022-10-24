import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class OrderService {


    public Order generateOrder(String orderPath) throws FileNotFoundException {
        Order newOrder = new Order();
        Scanner scanOrder = new Scanner(new File(orderPath));
        String buyerName = scanOrder.nextLine();
        String itemName = scanOrder.nextLine();
        int itemQuantity = scanOrder.nextInt();
        scanOrder.nextLine();
        LocalDate buyDate = LocalDate.parse(scanOrder.nextLine());
        scanOrder.close();
        newOrder.setBuyer(buyerName);
        newOrder.setProductBought(itemName);
        newOrder.setHowMuchBought(itemQuantity);
        newOrder.setBuyDate(buyDate);
        return newOrder;

    }
    public int add(int a, int b){
        return a + b;

    }
}
