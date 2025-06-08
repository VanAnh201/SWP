package swp391.project.DeliverySystem.mapper;

import swp391.project.DeliverySystem.entity.Label;
import swp391.project.DeliverySystem.dto.LabelDTO;

public class LabelMapper {
    public static LabelDTO mapToLabelDTO(Label label) {
        if (label == null) return null;
        return new LabelDTO(
            label.getId() != null ? label.getId().intValue() : null,
            label.getLabelName(),
            label.getDescription(),
            label.getContactInfo(),
            label.getStatus()
        );
    }

    public static Label mapToLabel(LabelDTO labelDTO) {
        return new Label(
            labelDTO.getId() != null ? labelDTO.getId().longValue() : null,
            labelDTO.getLabelName(),
            labelDTO.getDescription(),
            labelDTO.getContactInfo(),
            labelDTO.getStatus()
        );
    }
}