package swp391.project.DeliverySystem.entity;

import java.time.LocalDateTime;
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
@Table(
    name = "CustomerVouchers",
    uniqueConstraints = @UniqueConstraint(columnNames = { "CustomerID", "VoucherID" })
)
public class CustomerVouchers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CustomerID", nullable = false)
    private Customers customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VoucherID", nullable = false)
    private Vouchers voucher;

    @Column(name = "IsUsed", nullable = false)
    private Boolean isUsed = false;

    @Column(name = "UsedAt")
    private LocalDateTime usedAt;
}
