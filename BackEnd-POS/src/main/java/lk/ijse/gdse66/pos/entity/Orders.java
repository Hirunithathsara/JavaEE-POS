package lk.ijse.gdse66.pos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orders {
    private String orderId;
    private String orderDate;
    private String cusId;
}