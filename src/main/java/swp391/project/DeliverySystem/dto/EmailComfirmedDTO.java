package swp391.project.DeliverySystem.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import swp391.project.DeliverySystem.entity.Customers;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmailComfirmedDTO {
    private Integer id;
    private Customers customer;
    private String token;
    private LocalDateTime expirationDate;
}
