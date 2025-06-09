package swp391.project.DeliverySystem.dto;

import swp391.project.DeliverySystem.entity.Roles;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomersDTO {
    private long id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Integer citizenId;
    private LocalDate dateOfBirth;
    private String customerType;
    private String passwordHash;
    private Boolean isEmailConfirmed;
    private Boolean isDeleted;
    private Roles role;  // ← Đổi từ Integer thành Long
}
