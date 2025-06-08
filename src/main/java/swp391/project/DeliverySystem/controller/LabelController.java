package swp391.project.DeliverySystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import swp391.project.DeliverySystem.service.LabelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import swp391.project.DeliverySystem.dto.LabelDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/labels")
public class LabelController {
    private LabelService labelService;
    
    @PostMapping
    public ResponseEntity<LabelDTO> createLabels(@RequestBody LabelDTO labelDTO) {
        LabelDTO savedLabel = labelService.createLabels(labelDTO);
        return new ResponseEntity<>(savedLabel, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<LabelDTO> getLabelById(@PathVariable("id") Long LabelId) {
        LabelDTO labelDTO = labelService.getLabelById(LabelId);
        return ResponseEntity.ok(labelDTO);
    }

    @GetMapping
    public ResponseEntity<List<LabelDTO>> getAllLabel() {
        List<LabelDTO> labels = labelService.getAllLabel();
        return ResponseEntity.ok(labels);
    }

    @PutMapping("{id}")
    public ResponseEntity<LabelDTO> updateLabel(@PathVariable("id") Long LabelId, @RequestBody LabelDTO labelDTO) {
        LabelDTO updatedLabel = labelService.updateLabel(LabelId, labelDTO);
        return ResponseEntity.ok(updatedLabel);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteLabel(@PathVariable("id") Long LabelId) {
        labelService.deleteLabelById(LabelId);
        return ResponseEntity.ok("Label deleted successfully");
    }
}
