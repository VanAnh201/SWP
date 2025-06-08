package swp391.project.DeliverySystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LabelDTO {
    private Integer id;
    private String labelName;
    private String description;
    private String contactInfo;
    private String status;
}
