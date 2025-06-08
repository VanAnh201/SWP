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
@CrossOrigin(origins = "*")  // Cho phép mọi nguồn (thay "*" bằng domain frontend nếu cần giới hạn)
public class StorageController {

    private final StorageService storageService;

    /**
     * GET /api/storages
     * Trả về danh sách tất cả Storage dưới dạng JSON array.
     */
    @GetMapping
    public ResponseEntity<List<StorageDTO>> getAllStorages() {
        List<StorageDTO> list = storageService.getAllStorages();
        return ResponseEntity.ok(list);
    }

    /**
     * GET /api/storages/{id}
     * Trả về 1 Storage theo ID. Nếu không tồn tại, ném ResourceNotFound.
     */
    @GetMapping("/{id}")
    public ResponseEntity<StorageDTO> getStorageById(@PathVariable("id") Long id) {
        StorageDTO dto = storageService.getStorageById(id);
        return ResponseEntity.ok(dto);
    }

    /**
     * POST /api/storages
     * Tạo mới 1 Storage. Body gửi lên phải là StorageDTO (có thể để id = null).
     */
    @PostMapping
    public ResponseEntity<StorageDTO> createStorage(@RequestBody StorageDTO storageDTO) {
        StorageDTO created = storageService.createStorage(storageDTO);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    /**
     * PUT /api/storages/{id}
     * Cập nhật Storage với ID tương ứng. Body chứa StorageDTO mới.
     */
    @PutMapping("/{id}")
    public ResponseEntity<StorageDTO> updateStorage(
            @PathVariable("id") Long id,
            @RequestBody StorageDTO storageDTO
    ) {
        StorageDTO updated = storageService.updateStorage(id, storageDTO);
        return ResponseEntity.ok(updated);
    }

    /**
     * DELETE /api/storages/{id}
     * Xóa Storage theo ID.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStorage(@PathVariable("id") Long id) {
        storageService.deleteStorage(id);
        return ResponseEntity.noContent().build(); // 204 No Content
    }
}
