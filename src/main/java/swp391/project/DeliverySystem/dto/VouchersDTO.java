package swp391.project.DeliverySystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VouchersDTO {
    private Long id;
    private String code;
    private String description;
    private BigDecimal discountValue;
    private String discountType;
    private BigDecimal minOrderAmount;
    private BigDecimal maxDiscountAmount;
    private Integer usageLimit;
    private Integer usageCount;
    private String status;
    private LocalDate startDate;
    private LocalDate endDate;
}