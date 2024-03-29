package lk.ijse.gdse66.pos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDTO {
    String code;
    String description;
    int qty;
    double unitPrice;
}