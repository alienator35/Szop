package service;

import domain.Order;
import exception.OrderNotFoundException;
import service.OrderService;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class OrderServiceTest {
    @Test
    public void ShouldGenerateOrderWhenOrderFileExistAndOrderIsComplete() throws FileNotFoundException {
        OrderService orderService = new OrderService();

        Order order = orderService.generateOrder("Shop Order.txt");

        assertEquals("Patryk Szkutakkk", order.getBuyer());
        assertEquals("Hammer", order.getProductBought());
    }

    @Test
    public void ShouldOrderNotFoundExceptionWhenGenerateOrderBadPath() throws OrderNotFoundException {
        OrderService orderService = new OrderService();

        Exception exception = assertThrows(OrderNotFoundException.class, () -> {
            orderService.generateOrder("jakiś path zły, nie dobry, parszywy, niesprawiedliwy, niegodny, wir śmierdzielu");
        });
    }

    @Test
    public void ShouldOrderNotFoundExceptionWhenGenerateOrderNullPath() throws OrderNotFoundException {
        OrderService orderService = new OrderService();
        Exception exception2 = assertThrows(OrderNotFoundException.class, () -> {
            orderService.generateOrder(null);
        });
    }
}