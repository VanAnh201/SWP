package swp391.project.DeliverySystem.entity;

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
@Table(name = "Staffs")
public class Staffs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FullName", nullable = false, length = 100)
    private String fullName;

    @Column(name = "Email", unique = true, length = 100)
    private String email;

    @Column(name = "PhoneNumber", unique = true, length = 10)
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AssignedLabelID")
    private Label label; // ánh xạ đến bảng Labels

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AssignedStorageID")
    private Storage storage; // ánh xạ đến bảng Storages

    @Column(name = "Status", length = 100)
    private String status;
}
