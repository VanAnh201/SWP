package swp391.project.DeliverySystem.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import swp391.project.DeliverySystem.entity.Customers;
import swp391.project.DeliverySystem.entity.Vouchers;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerVouchersDTO {
    private Integer id;
    private Customers customer;
    private Vouchers vouchers;
    private LocalDateTime usedAt;
    private Boolean isUsed;
}
