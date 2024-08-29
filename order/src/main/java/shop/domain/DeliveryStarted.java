package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long productid;
    private Integer qty;
    private Date deliveryDate;
    private Long orderid;
    private String address;
}
