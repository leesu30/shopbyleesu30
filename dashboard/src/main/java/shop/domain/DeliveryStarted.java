package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shop.infra.AbstractEvent;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long productid;
    private Integer qty;
    private Date deliveryDate;
    private Long orderid;
    private String address;
}
