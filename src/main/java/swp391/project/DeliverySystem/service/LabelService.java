package swp391.project.DeliverySystem.service;

import java.util.List;
import swp391.project.DeliverySystem.dto.LabelDTO;

public interface LabelService {
    LabelDTO createLabels(LabelDTO labelDTO);

    LabelDTO getLabelById(Long LabelId);

    List<LabelDTO> getAllLabel();

    LabelDTO updateLabel(Long LabelId, LabelDTO labelDTO);

    void deleteLabelById(Long LabelId);
}
