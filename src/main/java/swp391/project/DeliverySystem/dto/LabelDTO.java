package swp391.project.DeliverySystem.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LabelDTO {
    private Long id;

    @NotBlank(message = "Label name is required")
    @Size(min = 2, max = 100, message = "Label name must be between 2 and 100 characters")
    private String labelName;

    @Size(max = 500, message = "Description cannot exceed 500 characters")
    private String description;

    @Size(max = 200, message = "Contact info cannot exceed 200 characters")
    private String contactInfo;

    @NotBlank(message = "Status is required")
    private String status;
}
