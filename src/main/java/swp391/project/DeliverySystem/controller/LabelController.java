package swp391.project.DeliverySystem.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;
import swp391.project.DeliverySystem.service.LabelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import swp391.project.DeliverySystem.dto.LabelDTO;
import swp391.project.DeliverySystem.exception.ResourceNotFoundException;
import jakarta.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/labels")
@CrossOrigin(origins = "*")
@Tag(name = "Label", description = "Label management APIs")
public class LabelController {
    private final LabelService labelService;

    @Operation(
            summary = "Create new label",
            description = "Creates a new label with provided details"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Label created successfully",
            content = @Content(schema = @Schema(implementation = LabelDTO.class))
    )
    @ApiResponse(
            responseCode = "400",
            description = "Invalid input data",
            content = @Content
    )
    @ApiResponse(
            responseCode = "500",
            description = "Internal server error",
            content = @Content
    )
    @PostMapping
    public ResponseEntity<LabelDTO> createLabels(@Valid @RequestBody LabelDTO labelDTO) {
        try {
            LabelDTO savedLabel = labelService.createLabels(labelDTO);
            return new ResponseEntity<>(savedLabel, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(
            summary = "Get label by ID",
            description = "Retrieves a label by its unique ID"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Label retrieved successfully",
            content = @Content(schema = @Schema(implementation = LabelDTO.class))
    )
    @ApiResponse(
            responseCode = "404",
            description = "Label not found",
            content = @Content
    )
    @ApiResponse(
            responseCode = "500",
            description = "Internal server error",
            content = @Content
    )
    @GetMapping("/{id}")
    public ResponseEntity<LabelDTO> getLabelById(@PathVariable("id") Long labelId) {
        try {
            LabelDTO labelDTO = labelService.getLabelById(labelId);
            return ResponseEntity.ok(labelDTO);
        } catch (ResourceNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Operation(
            summary = "Get all labels",
            description = "Retrieves a list of all labels"
    )
    @ApiResponse(
            responseCode = "200",
            description = "List of labels retrieved successfully",
            content = @Content(schema = @Schema(implementation = LabelDTO.class))
    )
    @ApiResponse(
            responseCode = "500",
            description = "Internal server error",
            content = @Content
    )
    @GetMapping
    public ResponseEntity<List<LabelDTO>> getAllLabel() {
        try {
            List<LabelDTO> labels = labelService.getAllLabel();
            return ResponseEntity.ok(labels);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(
            summary = "Update label by ID",
            description = "Updates an existing label with the given ID and details"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Label updated successfully",
            content = @Content(schema = @Schema(implementation = LabelDTO.class))
    )
    @ApiResponse(
            responseCode = "400",
            description = "Invalid input data",
            content = @Content
    )
    @ApiResponse(
            responseCode = "404",
            description = "Label not found",
            content = @Content
    )
    @ApiResponse(
            responseCode = "500",
            description = "Internal server error",
            content = @Content
    )
    @PutMapping("/{id}")
    public ResponseEntity<LabelDTO> updateLabel(
            @PathVariable("id") Long labelId,
            @Valid @RequestBody LabelDTO labelDTO) {
        try {
            LabelDTO updatedLabel = labelService.updateLabel(labelId, labelDTO);
            return ResponseEntity.ok(updatedLabel);
        } catch (ResourceNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(
            summary = "Delete label by ID",
            description = "Deletes a label with the specified ID"
    )
    @ApiResponse(
            responseCode = "204",
            description = "Label deleted successfully"
    )
    @ApiResponse(
            responseCode = "404",
            description = "Label not found",
            content = @Content
    )
    @ApiResponse(
            responseCode = "500",
            description = "Internal server error",
            content = @Content
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLabel(@PathVariable("id") Long labelId) {
        try {
            labelService.deleteLabelById(labelId);
            return ResponseEntity.noContent().build();
        } catch (ResourceNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}