package swp391.project.DeliverySystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StorageDTO {
    private Long id;
    private String storageName;
    private String address;
    private Integer capacity;
    private BigDecimal pricePerMonth;
    private String contactInfo;
    private String status;
}