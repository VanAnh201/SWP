package swp391.project.DeliverySystem.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "OrderTracking")
public class OrderTracking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrderID", nullable = false)
    private OrderRequests order;

    @Column(name = "TrackingNumber", nullable = false, length = 100)
    private String trackingNumber;

    @Column(name = "Status", nullable = false, length = 100)
    private String status;

    @Column(name = "Location", length = 250)
    private String location;

    @Column(name = "Notes", columnDefinition = "TEXT")
    private String notes;

    @Column(name = "UpdatedAt", insertable = false, updatable = false)
    private LocalDateTime updatedAt;
}

