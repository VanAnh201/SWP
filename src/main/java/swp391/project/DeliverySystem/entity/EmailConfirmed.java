package swp391.project.DeliverySystem.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "EmailConfirmed")
public class EmailConfirmed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    // Khóa ngoại đến Customers
    @ManyToOne
    @JoinColumn(name = "CustomerID", nullable = false)
    private Customers customer;

    @Column(name = "Token", nullable = false, length = 255)
    private String token;

    @Column(name = "ExpirationDate", nullable = false)
    private LocalDateTime expirationDate;
}
