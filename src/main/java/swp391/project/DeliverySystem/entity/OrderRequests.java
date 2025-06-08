package swp391.project.DeliverySystem.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
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
@Table(name = "OrderRequests")
public class OrderRequests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CustomerID", nullable = false)
    private Customers customer;

    @Column(name = "TrackingNumber", unique = true, length = 100)
    private String trackingNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LabelID")
    private Label label;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SurveyStaffID")
    private Staffs surveyStaff;

    @Column(name = "SurveyDate")
    private LocalDate surveyDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StorageID")
    private Storage storage;

    @Column(name = "PickUpLocation", length = 250)
    private String pickUpLocation;

    @Column(name = "DeliveryLocation", length = 250)
    private String deliveryLocation;

    @Column(name = "Transport", length = 100)
    private String transport;

    @Column(name = "PickUpDate")
    private LocalDate pickUpDate;

    @Column(name = "ExpectedDeliveryTime")
    private LocalDateTime expectedDeliveryTime;

    @Column(name = "TotalAmount", precision = 10, scale = 2)
    private BigDecimal totalAmount;

    @Column(name = "Status", nullable = false, length = 100)
    private String status;

    @Column(name = "CreatedAt", updatable = false, insertable = false)
    private LocalDateTime createdAt;

    @Column(name = "UpdatedAt", insertable = false, updatable = false)
    private LocalDateTime updatedAt;
}