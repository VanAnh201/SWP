package swp391.project.DeliverySystem.entity;

import java.math.BigDecimal;
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
@Table(name = "Storages")
public class Storage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "StorageName", nullable = false, length = 100)
    private String storageName;

    @Column(name = "Address", length = 250)
    private String address;

    @Column(name = "Capacity")
    private Integer capacity;

    @Column(name = "PricePerMonth", precision = 10, scale = 2)
    private BigDecimal pricePerMonth;

    @Column(name = "ContactInfo", length = 250)
    private String contactInfo;

    @Column(name = "Status", length = 100)
    private String status;
}
