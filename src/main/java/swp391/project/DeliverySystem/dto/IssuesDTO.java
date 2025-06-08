package swp391.project.DeliverySystem.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import swp391.project.DeliverySystem.entity.Customers;
import swp391.project.DeliverySystem.entity.OrderRequests;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IssuesDTO {
    public long id;
    private String incidentCode;
    private OrderRequests orderRequest;;
    private Customers customer;
    private LocalDate incidentDate;
    private String description;
    private String resolution;
    private String status;
}
