package swp391.project.DeliverySystem.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import swp391.project.DeliverySystem.dto.LabelDTO;
import swp391.project.DeliverySystem.entity.Label;
import swp391.project.DeliverySystem.exception.ResourceNotFoundException;
import swp391.project.DeliverySystem.mapper.LabelMapper;
import swp391.project.DeliverySystem.repository.LabelRepository;
import swp391.project.DeliverySystem.service.LabelService;


@Service
@AllArgsConstructor
public class LabelServiceImpl implements LabelService {

    private LabelRepository labelRepository;

    @Override
    public LabelDTO createLabels(LabelDTO labelDTO) {
        Label label = LabelMapper.mapToLabel(labelDTO);
        Label savedLabel = labelRepository.save(label);
        return LabelMapper.mapToLabelDTO(savedLabel);
    }

    @Override
    public LabelDTO getLabelById(Long LabelId) {
        Label Label = labelRepository.findById(LabelId)
                .orElseThrow(() -> new ResourceNotFoundException("Label Not Found with id: "+ LabelId));
        return LabelMapper.mapToLabelDTO(Label);
    }

    @Override
    public List<LabelDTO> getAllLabel() {
        List<Label> label = labelRepository.findAll();
        return label.stream()
                .map(labels -> LabelMapper.mapToLabelDTO(labels))
                .collect(Collectors.toList());
    }

    @Override
    public LabelDTO updateLabel(Long LabelId, LabelDTO labelDTO) {
        Label Label = labelRepository.findById(LabelId)
                .orElseThrow(() -> new ResourceNotFoundException("Label Not Found with id: "+ LabelId));
        Label.setLabelName(labelDTO.getLabelName());
        Label.setDescription(labelDTO.getDescription());
        Label.setContactInfo(labelDTO.getContactInfo());
        Label.setStatus(labelDTO.getStatus());
        Label updatedLabelObj = labelRepository.save(Label);
        return LabelMapper.mapToLabelDTO(updatedLabelObj);
    }       

    @Override
    public void deleteLabelById(Long LabelId) {
        Label label = labelRepository.findById(LabelId)
                .orElseThrow(() -> new ResourceNotFoundException("Label Not Found with id: "+ LabelId));
                System.out.println("Deleting label: " + label.getLabelName());
        labelRepository.deleteById(LabelId);
    }
}
