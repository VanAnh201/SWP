package swp391.project.DeliverySystem.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CustomerID", nullable = false)
    private Customers customer;

    @Column(name = "TotalAmount", precision = 10, scale = 2, nullable = false)
    private BigDecimal totalAmount;

    @Column(name = "PaymentDate", insertable = false, updatable = false)
    private LocalDateTime paymentDate;

    @Column(name = "PaymentMethod", length = 50)
    private String paymentMethod;

    @Column(name = "Status", length = 100)
    private String status;
}
