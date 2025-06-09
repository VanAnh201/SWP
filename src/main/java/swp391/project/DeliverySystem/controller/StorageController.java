package swp391.project.DeliverySystem.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import swp391.project.DeliverySystem.dto.StorageDTO;
import swp391.project.DeliverySystem.service.StorageService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/storages")

public class StorageController {

    private final StorageService storageService;

    @GetMapping
    public ResponseEntity<List<StorageDTO>> getAllStorages() {
        List<StorageDTO> list = storageService.getAllStorages();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<StorageDTO> getStorageById(@PathVariable("id") Long id) {
        StorageDTO dto = storageService.getStorageById(id);
        return ResponseEntity.ok(dto);
    }
    @PostMapping
    public ResponseEntity<StorageDTO> createStorage(@RequestBody StorageDTO storageDTO) {
        StorageDTO created = storageService.createStorage(storageDTO);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StorageDTO> updateStorage(
            @PathVariable("id") Long id,
            @RequestBody StorageDTO storageDTO
    ) {
        StorageDTO updated = storageService.updateStorage(id, storageDTO);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStorage(@PathVariable("id") Long id) {
        storageService.deleteStorage(id);
        return ResponseEntity.noContent().build();
    }
}
