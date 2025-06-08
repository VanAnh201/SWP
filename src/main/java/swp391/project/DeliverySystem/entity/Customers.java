package swp391.project.DeliverySystem.entity;

import java.time.LocalDate;
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
@Table(name = "Customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FullName", nullable = false, length = 50)
    private String fullName;

    @Column(name = "Email", nullable = false, length = 100)
    private String email;

    @Column(name = "PhoneNumber", length = 10)
    private String phoneNumber;

    @Column(name = "CitizenID")
    private Integer citizenId; // INT NULL

    @Column(name = "DateOfBirth")
    private LocalDate dateOfBirth; // DATE NULL

    @Column(name = "CustomerType", length = 50)
    private String customerType; // VARCHAR(50)

    @Column(name = "PasswordHash", nullable = false, length = 250)
    private String passwordHash;

    @Column(name = "IsEmailConfirmed", nullable = false)
    private Boolean isEmailConfirmed; // BIT NOT NULL

    @Column(name = "IsDeleted", nullable = false)
    private Boolean isDeleted; // BIT NOT NULL

    // RoleID INT NOT NULL
    // Nếu muốn ánh xạ thành ManyToOne với Entity Roles, có thể dùng như sau:
    @ManyToOne
    @JoinColumn(name = "RoleID", nullable = false)
    private Roles role;
}
