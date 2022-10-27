package service;

import domain.*;
import exception.*;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class OrderService {


    public Order generateOrder(String orderPath) {
        if (orderPath == null) {
            throw new OrderNotFoundException("orderpath nie istnieje");
        }

        InputStream is = this.getClass().getClassLoader().getResourceAsStream(orderPath);


        if (is == null) {
            throw new OrderNotFoundException("domain.Order pliku " + orderPath + " nie istnieje");
        }

        Order newOrder = new Order();
        Scanner scanOrder = new Scanner(is);
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
}
