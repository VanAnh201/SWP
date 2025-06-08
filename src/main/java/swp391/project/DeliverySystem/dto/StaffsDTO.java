package swp391.project.DeliverySystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StaffsDTO {
    private Long id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Long assignedLabelId;  // Chỉ lấy ID thay vì cả object
    private Long assignedStorageId; // Chỉ lấy ID thay vì cả object
    private String status;
}