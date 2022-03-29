package order.order;

import order.article.*;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    @Id
    private Long id;
    private List<OrderLine> orderLine;

    public Float getPrice(){
        this.orderLine.forEach(order -> order.);
    }

}
