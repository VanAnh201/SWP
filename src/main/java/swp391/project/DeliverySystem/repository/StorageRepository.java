package swp391.project.DeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp391.project.DeliverySystem.entity.Storage;

public interface StorageRepository extends JpaRepository<Storage, Long> {

    // Additional query methods can be defined here if needed

}
