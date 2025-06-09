package swp391.project.DeliverySystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderTrackingDTO {
    private Long id;
    private Long orderId;
    private String trackingNumber;
    private String status;
    private LocalDateTime updatedAt;
    private String location;
    private String notes;
}
