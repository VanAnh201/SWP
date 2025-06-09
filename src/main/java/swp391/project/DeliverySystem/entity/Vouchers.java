package swp391.project.DeliverySystem.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Vouchers")
public class Vouchers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Code", nullable = false, unique = true, length = 50)
    private String code;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "DiscountValue", precision = 10, scale = 2)
    private BigDecimal discountValue;

    @Column(name = "DiscountType", length = 50)
    private String discountType;

    @Column(name = "MinOrderAmount", precision = 10, scale = 2)
    private BigDecimal minOrderAmount;

    @Column(name = "MaxDiscountAmount", precision = 10, scale = 2)
    private BigDecimal maxDiscountAmount;

    @Column(name = "UsageLimit")
    private Integer usageLimit;

    @Column(name = "UsageCount")
    private Integer usageCount = 0;

    @Column(name = "Status", length = 100)
    private String status;

    @Column(name = "StartDate")
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;
}
