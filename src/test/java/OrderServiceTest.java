import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class OrderServiceTest  {
//    @Test
//    void isShopOrderNamePatrykSzkutak() throws FileNotFoundException {
//        OrderService orderService = new OrderService();
//        Order order = new Order();
//        order = orderService.generateOrder("E:\\Shop Order.txt");
//
//        assertEquals("Patryk Szkutakkk", order.getBuyer());
//
//    }

    @Test
    public void isTwoPlusTwoFour(){
        var adding = new OrderService();
        assertEquals(4,adding.add(2,2));

    }
}