package lk.ijse.gdse66.pos.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {
    private String id
    private String name;
    private String address;
    private double salary;
}