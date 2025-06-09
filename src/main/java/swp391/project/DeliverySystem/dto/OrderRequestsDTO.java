package swp391.project.DeliverySystem.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import swp391.project.DeliverySystem.entity.Customers;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestsDTO {
    private Long id;
    private Customers customer;
    private String trackingNumber;
    private Long labelId; 
    private Long surveyStaffId;
    private LocalDate surveyDate;
    private Long storageId; 
    private String pickUpLocation;
    private String deliveryLocation;
    private String transport;
    private LocalDate pickUpDate;
    private LocalDateTime expectedDeliveryTime;
    private BigDecimal totalAmount;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
