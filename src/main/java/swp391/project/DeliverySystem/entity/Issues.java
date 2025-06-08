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
@Table(name = "Issues")
public class Issues {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "IncidentCode", nullable = false, unique = true, length = 50)
    private String incidentCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrderID", nullable = false)
    private OrderRequests order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CustomerID", nullable = false)
    private Customers customer;

    @Column(name = "IncidentDate", insertable = false, updatable = false)
    private LocalDateTime incidentDate;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "Resolution", columnDefinition = "TEXT")
    private String resolution;

    @Column(name = "Status", nullable = false, length = 100)
    private String status;
}

